package kr.xit.core.spring.config.db;

import java.util.Arrays;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionException;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import kr.xit.core.consts.Constants;

/**
 * <pre>
 * description : Mybatis 설정
 *               - single DB or multi DB 설정에 따라 transaction 설정 적용
 * packageName : kr.xit.core.spring.config.db
 * fileName    : MybatisConfig
 * author      : julim
 * date        : 2023-04-28
 * ======================================================================
 * 변경일         변경자        변경 내용
 * ----------------------------------------------------------------------
 * 2023-04-28    julim       최초 생성
 * 2023-10-30    julim       dynamic 설정 적용
 *
 * </pre>
 * @see PrimaryDatasourceConfig
 * @see SecondaryMybatisConfig
 */
@Configuration
@EnableTransactionManagement
public class TransactionConfig {

    /**
     * primary DB 만 선언 된 경우
     * @param ds DataSource
     * @return PlatformTransactionManager
     */
    @ConditionalOnMissingBean(SecondaryMybatisConfig.class)
    @Primary
    @Bean
    public PlatformTransactionManager primaryTransactionManager(@Qualifier(Constants.PRIMARY_DATA_SOURCE)DataSource ds) {
        DataSourceTransactionManager dstm = new DataSourceTransactionManager(ds);
        dstm.setGlobalRollbackOnParticipationFailure(false);
        return dstm;
    }

    ////////////////////////////////////////////////////////////////////////////////////////////
    // ChainedTransactionManager : trsnsaction binding
    ///////////////////////////////////////////////////////////////////////////////////////////
    /**
     * primary DB & secondary DB Transaction binding
     * @param primaryDS primary DataSource
     * @param secondDS secondary DataSource
     * @return PlatformTransactionManager
     */
    @ConditionalOnBean(SecondaryMybatisConfig.class)
    @Primary
    @Bean
    public PlatformTransactionManager transactionManager(@Qualifier(Constants.PRIMARY_DATA_SOURCE)DataSource primaryDS,
                                                         @Qualifier(Constants.SECONDARY_DATA_SOURCE) DataSource secondDS) {
        DataSourceTransactionManager primaryTm = new DataSourceTransactionManager(primaryDS);
        primaryTm.setGlobalRollbackOnParticipationFailure(false);
        primaryTm.setNestedTransactionAllowed(true);

        DataSourceTransactionManager secondTm = new DataSourceTransactionManager(secondDS);
        secondTm.setGlobalRollbackOnParticipationFailure(false);
        secondTm.setNestedTransactionAllowed(true);

        // creates chained transaction manager
        //return new ChainedTransactionManager(primaryTm, secondTm);

        // Creates a list of transaction managers
        List<PlatformTransactionManager> transactionManagers = Arrays.asList(primaryTm, secondTm);

        // Creates a custom transaction manager that delegates to a list of transaction managers
        return new CustomTransactionManager(transactionManagers);
    }
    /////////////////////////////////////////////////////////////////////////////////////

    // Custom transaction manager implementation
    private static class CustomTransactionManager implements PlatformTransactionManager {

        private final List<PlatformTransactionManager> transactionManagers;

        public CustomTransactionManager(List<PlatformTransactionManager> transactionManagers) {
            this.transactionManagers = transactionManagers;
        }

        @Override
        public void commit(TransactionStatus status) throws TransactionException {
            for (PlatformTransactionManager transactionManager : transactionManagers) {
                transactionManager.commit(status);
            }
        }

        @Override
        public TransactionStatus getTransaction(TransactionDefinition definition) throws TransactionException {
            // We're assuming all transaction managers support the same transaction definition
            return transactionManagers.get(0).getTransaction(definition);
        }

        @Override
        public void rollback(TransactionStatus status) throws TransactionException {
            for (PlatformTransactionManager transactionManager : transactionManagers) {
                transactionManager.rollback(status);
            }
        }
    }
}

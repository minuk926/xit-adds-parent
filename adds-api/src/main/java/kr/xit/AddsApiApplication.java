package kr.xit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.ApplicationPidFileWriter;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.ComponentScan;

import kr.xit.core.spring.config.support.CustomBeanNameGenerator;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootApplication
@ConfigurationPropertiesScan(basePackages = {"egovframework", "kr.xit"})
@ServletComponentScan
@ComponentScan(
    nameGenerator = CustomBeanNameGenerator.class,
    basePackages = {"egovframework", "kr.xit"}
)
public class AddsApiApplication {

    public static void main(String[] args) {
        final List<String> basePackages = new ArrayList<>(
            Arrays.asList("egovframework", "kr.xit")
        );

        final String line = "====================================================================";
        log.info(line);
        log.info("====    AddsApiApplication start :: active profiles - {}    ====",
            System.getProperty("spring.profiles.active"));
        if (Objects.isNull(System.getProperty("spring.profiles.active"))) {

            log.error(">>>>>>>>>>>>>>        Undefined start VM option       <<<<<<<<<<<<<<");
            log.error(">>>>>>>>>>>>>> -Dspring.profiles.active=local|dev|prd <<<<<<<<<<<<<<");
            log.error("============== AddsApiApplication start fail ===============");
            log.error(line);
            System.exit(-1);
        }
        log.info(line);

        // beanName Generator 등록 : API v1, v2 등으로 분류하는 경우
        // Bean 이름 식별시 풀패키지 명으로 식별 하도록 함
        final CustomBeanNameGenerator beanNameGenerator = new CustomBeanNameGenerator();
        beanNameGenerator.addBasePackages(basePackages);

        final SpringApplicationBuilder applicationBuilder = new SpringApplicationBuilder(AddsApiApplication.class);
        applicationBuilder.beanNameGenerator(beanNameGenerator);

        final SpringApplication application = applicationBuilder.build();
        application.setBannerMode(Banner.Mode.OFF);
        application.setLogStartupInfo(false);

        //TODO : 이벤트 실행 시점이 Application context 실행 이전인 경우 리스너 추가
        //PID(Process ID 작성)
        application.addListeners(new ApplicationPidFileWriter());
        application.run(args);

        log.info("=========================================================================================");
        log.info("==========      AddsApiApplication load Complete :: active profiles - {}     ==========",
            System.getProperty("spring.profiles.active"));
        log.info("=========================================================================================");
    }

}

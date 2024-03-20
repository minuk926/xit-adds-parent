package kr.xit.biz.cmm.service;

import org.springframework.cache.CacheManager;
import org.springframework.cache.caffeine.CaffeineCache;
import org.springframework.stereotype.Service;

import com.github.benmanes.caffeine.cache.Cache;
import com.github.benmanes.caffeine.cache.stats.CacheStats;

import kr.xit.biz.cmm.mapper.ICmmCacheMapper;
import kr.xit.core.spring.config.cache.CacheType;
import kr.xit.core.spring.config.cache.CachingConfig;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

/**
 * <pre>
 * description : 전자고지 Cache 서비스
 *               - cache: CaffeineCache use
 *
 * packageName : kr.xit.biz.cmm.service
 * fileName    : CmmEnsCacheService
 * author      : limju
 * date        : 2023-09-12
 * ======================================================================
 * 변경일         변경자        변경 내용
 * ----------------------------------------------------------------------
 * 2023-09-12    limju       최초 생성
 *
 * </pre>
 * @see CacheType
 * @see CachingConfig
 * @see org.springframework.cache.interceptor.SimpleKeyGenerator
 */
@Service
@Slf4j
@RequiredArgsConstructor
public class CmmCacheService implements ICmmCacheService {
    private final ICmmCacheMapper cmmMapper;
    private final CacheManager cacheManager;

    /**
     * cache log : hit rate
     */
    public void logCache(){
        if(log.isDebugEnabled()) {
            for(String cacheName : cacheManager.getCacheNames()) {
                Cache<Object, Object> cache = ((CaffeineCache) cacheManager.getCache(cacheName)).getNativeCache();

                for(Object key : cache.asMap().keySet()) {
                    //Object value = cache.getIfPresent(key);
                    log.info("key: {}", key);
                    //log.info("key: {} - value: {}", key, value.toString());
                }

                CacheStats stats = cache.stats();
                log.info("cache '{}' - stats : {}", cacheName, stats.toString());
            }
        }
    }
}

package org.example.SwaggerDocExample.config;

import net.sf.ehcache.CacheManager;
import net.sf.ehcache.config.CacheConfiguration;
import org.springframework.cache.annotation.CachingConfigurerSupport;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.ehcache.EhCacheCacheManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableCaching
public class APIConfig extends CachingConfigurerSupport {
    @Bean
    CacheManager ecacheManager(){
        CacheConfiguration cacheConfiguration = new CacheConfiguration();
        cacheConfiguration.setTimeToLiveSeconds(10);
        cacheConfiguration.setName("ten-seconds");
        cacheConfiguration.setMaxEntriesLocalHeap(100);
        cacheConfiguration.setMemoryStoreEvictionPolicy("LRU");
        net.sf.ehcache.config.Configuration configuration = new net.sf.ehcache.config.Configuration();
        configuration.addCache(cacheConfiguration);
        return CacheManager.newInstance(configuration);
    }

    @Bean
    @Override
    public org.springframework.cache.CacheManager cacheManager(){
        return new EhCacheCacheManager(ecacheManager());
    }

}

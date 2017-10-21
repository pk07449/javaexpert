package com.pnakaj.spring.ioc.concurrentmapCache;

import org.springframework.cache.Cache;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.concurrent.ConcurrentMapCache;
import org.springframework.cache.concurrent.ConcurrentMapCacheFactoryBean;
import org.springframework.cache.support.SimpleCacheManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by pankaj on 2/27/2017.
 */
@Configuration
@EnableCaching
@ComponentScan("com.pnakaj.spring.ioc.concurrentmapCache")
public class AppConfig {

    @Bean(name = "cacheManager")
    public SimpleCacheManager getSimpleCacheManager() {
        SimpleCacheManager simpleCacheManager = new SimpleCacheManager();
        simpleCacheManager.setCaches(Arrays.asList(new ConcurrentMapCache("customer")));
        return  simpleCacheManager;
    }
}

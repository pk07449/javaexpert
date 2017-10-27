package com.pnakaj.spring.ioc.lifecycleCallback;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

/**
 * Created by pankaj on 2/27/2017.
 */
@Configuration
@EnableScheduling
@ComponentScan("com.pnakaj.spring.ioc.lifecycleCallback")
public class AppConfig {

    @Bean(initMethod = "mannualInit", destroyMethod = "manualDestroy")
    public Customer getCustomer() {
        return new Customer();
    }
}
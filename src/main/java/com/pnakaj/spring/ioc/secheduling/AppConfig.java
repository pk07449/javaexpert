package com.pnakaj.spring.ioc.secheduling;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

/**
 * Created by pankaj on 2/27/2017.
 */
@Configuration
@EnableScheduling
@ComponentScan("com.pnakaj.spring.ioc.secheduling")
public class AppConfig {

    @Scheduled(fixedRate=1000)
    public void doTask() {
        System.out.println("Do Task...");
    }

}

package com.pnakaj.spring.ioc.async;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

/**
 * Created by pankaj on 2/27/2017.
 */
@Configuration
@EnableAsync
@ComponentScan("com.pnakaj.spring.ioc.async")
public class AppConfig {


}

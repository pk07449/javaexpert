package com.pnakaj.spring.ioc.internationalization;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

/**
 * Created by pankaj on 2/27/2017.
 */
@Configuration
@EnableScheduling
@ComponentScan("com.pnakaj.spring.ioc.internationalization")
public class AppConfig {

    @Bean
    public MessageSource messageSource() {
        ResourceBundleMessageSource messageSource = new ResourceBundleMessageSource();
        messageSource.setBasenames("i18/users", "i18/errormsg");
        messageSource.setDefaultEncoding("UTF-8");
        return messageSource;
    }
}

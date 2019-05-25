package com.pnakaj.interviewquestion.spring.ioc.inheritance;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/**
 * Created by pankaj on 2/27/2017.
 */
@Configuration
@ComponentScan("com.pnakaj.interviewquestion.spring.ioc.inheritance")
public class AppConfig {

    @Bean
//    @Scope("prototype")
    @Qualifier(value = "getHello")
    public Hello getHello() {
        return new Hello();
    }

    @Bean
    @Scope("prototype")
    @Qualifier(value = "getHai")
    public Hai getHai() {
        return new Hai();
    }
}

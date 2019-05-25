package com.pnakaj.interviewquestion.spring.ioc.servletOrAnyOtherWebFramework.config;

import org.springframework.context.annotation.*;
/**
 * Created by pankaj on 5/25/2019.
 */
@Configuration
public class SimpleConfig {
        @Bean()
        @Scope(value="session")
        public CustomerService clickCounter() { return new CustomerService(); }

}

class CustomerService {

}

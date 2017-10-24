package com.pnakaj.spring.ioc.beanpostprocessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * Created by pankaj on 2/27/2017.
 */
@Configuration
@ComponentScan("com.pnakaj.spring.ioc.beanpostprocessor")
public class AppConfig {

    @Bean(initMethod = "init",destroyMethod = "destroy")
    public Customer getInfo() {
        System.out.println("Customer.getInfo");
        return new Customer();
    }


    class Customer {

        public void init(){
            System.out.println("Customer.init");
        }

        public void destroy(){
            System.out.println("Customer.destroy");
        }


    }

}

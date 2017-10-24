package com.pnakaj.spring.ioc.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.Arrays;
import java.util.List;

/**
 * Created by pankaj on 2/27/2017.
 */
@Configuration
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

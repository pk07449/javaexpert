package com.pnakaj.spring.ioc.propertyfileReading;

//Unpublished Work © 2017 Deere & Company.

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PropertiesFileReadingTest {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        System.out.println(context.getBean(AppConfig.class).getInfo());
    }
}


package com.pnakaj.spring.ioc.secheduling;

//Unpublished Work © 2017 Deere & Company.

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SechudulilngAnnotationTest {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
    }
}


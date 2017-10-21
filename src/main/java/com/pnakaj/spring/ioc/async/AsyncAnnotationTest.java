package com.pnakaj.spring.ioc.async;

//Unpublished Work © 2017 Deere & Company.

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AsyncAnnotationTest {
    public static void main(String[] args) throws InterruptedException {

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        context.getBean(AsyncTask.class).asyncTask();
        System.out.println("async is executing");
    }
}


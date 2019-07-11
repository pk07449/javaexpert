package com.pnakaj.spring.ioc.async;



import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AsyncAnnotationTest {
    public static void main(String[] args) throws InterruptedException {

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        context.getBean(AsyncTask.class).asyncTask();
        System.out.println("did not wait");
        context.getBean(AsyncTask.class).m1();
        System.out.println("was waiting");
    }
}


package com.pnakaj.spring.ioc.concurrentmapCache;



import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ConcurrentMapCacheAnnotationTest {
    public static void main(String[] args) throws InterruptedException {

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        context.getBean(CustomerService.class).getCustomer(1);
        context.getBean(CustomerService.class).getCustomer(1);
    }
}


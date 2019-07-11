package com.pnakaj.spring.ioc.factory.instancefactory;



import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InstantFactoryTest {
    public static void main(String[] args) {
        new ClassPathXmlApplicationContext("/com.pnakaj.spring.ioc.factory.instancefactory/applicationContext.xml");
    }
}


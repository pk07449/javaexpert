package com.pnakaj.spring.ioc.factory.staticfacoty;



import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StaticFactoryTest {
    public static void main(String[] args) {
        new ClassPathXmlApplicationContext("/com.pnakaj.spring.ioc.factory.staticfacoty/applicationContext.xml");
    }
}


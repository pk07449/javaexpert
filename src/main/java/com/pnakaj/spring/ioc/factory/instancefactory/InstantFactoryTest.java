package com.pnakaj.spring.ioc.factory.instancefactory;

//Unpublished Work © 2017 Deere & Company.

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InstantFactoryTest {
    public static void main(String[] args) {
        new ClassPathXmlApplicationContext("/com.pnakaj.spring.ioc.factory.instancefactory/applicationContext.xml");
    }
}


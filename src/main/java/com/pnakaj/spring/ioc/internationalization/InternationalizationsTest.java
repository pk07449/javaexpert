package com.pnakaj.spring.ioc.internationalization;

//Unpublished Work © 2017 Deere & Company.

import org.springframework.context.ApplicationContext;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Locale;

public class InternationalizationsTest {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        MessageSource resources = context.getBean(MessageSource.class);
        String name = resources.getMessage("errormsg.name", null, "Default", new Locale("de"));
        System.out.println(name);
    }
}


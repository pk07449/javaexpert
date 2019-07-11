package com.pnakaj.interviewquestion.spring.ioc.inheritance;



import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class InheritanceWithPrototypeScope {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        System.out.println(context.getBean("getHello"));
        System.out.println(context.getBean("getHello"));
        System.out.println(context.getBean("getHello"));

        System.out.println(context.getBean("getHai"));
        System.out.println(context.getBean("getHai"));
        System.out.println(context.getBean("getHai"));

        System.out.println(context.getBean("getHello"));
        System.out.println(context.getBean("getHello"));
        System.out.println(context.getBean("getHello"));

    }
}


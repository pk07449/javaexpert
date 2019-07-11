package com.pnakaj.spring.ioc.circularDependencySolution;



import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CyclicDependencyTest {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        System.out.println(context.getBean(College.class).getSchool());
        System.out.println(context.getBean(School.class).getCollege());
    }
}


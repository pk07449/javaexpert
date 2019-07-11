package com.pnakaj.spring.ioc.lookupmethod;



import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class LookupMthodAnnotationTest {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        System.out.println(context.getBean(ReprocessFactory.class).lookupDefaultUserReprocess().inMyJohndeere(new User()));
        System.out.println(context.getBean(ReprocessFactory.class).lookupCustomerReprocess().inMyJohndeere(new User()));
        System.out.println(context.getBean(ReprocessFactory.class).lookupDealerReprocess().inMyJohndeere(new User()));

    }
}


package com.pnakaj.spring.ioc.lifecycleCallback;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.InitDestroyAnnotationBeanPostProcessor;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * Created by pankaj on 10/27/2017.
 */
public class Customer  implements InitializingBean, DisposableBean {
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Customer.afterPropertiesSet");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Customer.destroy");
    }

    public void mannualInit() {
        System.out.println("Customer.mannualInit");
    }

    public void manualDestroy() {
        System.out.println("Customer.manualDestroy");
    }

    @PostConstruct
    public void annotationInit() {
        System.out.println("Customer.annotationInit");
    }

    @PreDestroy
    public void annotationDestroy() {
        System.out.println("Customer.annotationDestroy");
    }
}

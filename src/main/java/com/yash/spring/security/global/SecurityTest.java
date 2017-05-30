package com.yash.spring.security.global;

import com.yash.spring.security.global.service.HelloServiceImpl;
import com.yash.spring.security.global.securityconfig.SecurityAppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by pankaj on 2/27/2017.
 */
public class SecurityTest {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(SecurityAppConfig.class);

        HelloServiceImpl bean = context.getBean(HelloServiceImpl.class);
        System.out.println(bean.requiresUserRole());
    }
}

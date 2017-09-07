package com.pnakaj.spring.hibernate.mapping.association.onetomany;

import com.pnakaj.spring.hibernate.mapping.association.onetomany.config.AppConfig;
import com.pnakaj.spring.hibernate.mapping.association.onetomany.service.CustomerService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by pankaj on 7/15/2017.
 */
public class AppTest {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        CustomerService bean = annotationConfigApplicationContext.getBean(CustomerService.class);
        bean.saveEmployeeDetail();
    }
}

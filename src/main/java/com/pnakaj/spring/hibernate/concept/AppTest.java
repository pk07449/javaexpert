package com.pnakaj.spring.hibernate.concept;

import com.pnakaj.spring.hibernate.concept.config.AppConfig;
import com.pnakaj.spring.hibernate.concept.domain.Employee;
import com.pnakaj.spring.hibernate.concept.service.EmployeeService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by pankaj on 7/15/2017.
 */
public class AppTest {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        EmployeeService bean = annotationConfigApplicationContext.getBean(EmployeeService.class);
//        bean.saveEmployeeDetail();
        Employee employeeById = bean.getEmployeeById(2);
    }
}

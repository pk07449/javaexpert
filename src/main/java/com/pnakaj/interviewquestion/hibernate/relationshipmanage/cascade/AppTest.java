package com.pnakaj.interviewquestion.hibernate.relationshipmanage.cascade;

import com.pnakaj.interviewquestion.hibernate.relationshipmanage.cascade.config.AppConfig;
import com.pnakaj.interviewquestion.hibernate.relationshipmanage.cascade.service.EmployeeService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by pankaj on 7/15/2017.
 */
public class AppTest {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        EmployeeService bean = annotationConfigApplicationContext.getBean(EmployeeService.class);
        bean.saveEmployeeDetail();
    }
}

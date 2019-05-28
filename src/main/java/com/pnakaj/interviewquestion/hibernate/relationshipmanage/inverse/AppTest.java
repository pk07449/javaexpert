package com.pnakaj.interviewquestion.hibernate.relationshipmanage.inverse;

import com.pnakaj.interviewquestion.hibernate.relationshipmanage.inverse.service.EmployeeService;
import com.pnakaj.interviewquestion.hibernate.relationshipmanage.inverse.config.AppConfig;
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

package com.pnakaj.spring.ioc.dependson;

import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * Created by pankaj on 10/26/2017.
 */
@Service
@DependsOn({"customerRepo","dealerRepo"})
public class CustomerService {

    public CustomerService() {
        System.out.println("CustomerService.CustomerService");
    }
}

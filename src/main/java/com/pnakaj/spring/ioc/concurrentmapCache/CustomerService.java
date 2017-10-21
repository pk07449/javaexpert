package com.pnakaj.spring.ioc.concurrentmapCache;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

/**
 * Created by pankaj on 10/20/2017.
 */
@Component
public class CustomerService {

    @Cacheable("customer")
    public String getCustomer(int empId){
        System.out.println("execute getCustomer method..");
        if(empId==1){
            return "pankaj";
        }else{
            return "anika";
        }
    }
}

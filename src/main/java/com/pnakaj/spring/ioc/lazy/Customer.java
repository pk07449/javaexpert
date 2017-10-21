package com.pnakaj.spring.ioc.lazy;

//Unpublished Work © 2017 Deere & Company.

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class Customer implements User {


    public Customer() {
        System.out.println("Customer.Customer");
    }

    @Override
    public String toString() {
        return "Customer{}";
    }
}

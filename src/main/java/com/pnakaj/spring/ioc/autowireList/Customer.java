package com.pnakaj.spring.ioc.autowireList;



import org.springframework.stereotype.Component;

@Component
public class Customer implements User {

    public Customer() {
        System.out.println("Customer.Customer");
    }

    @Override
    public String toString() {
        return "Customer{}";
    }
}

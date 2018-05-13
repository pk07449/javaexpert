package com.pnakaj.spring.transaction.isolation.readcommited.controller;

import com.pnakaj.spring.transaction.isolation.readcommited.domain.Customer;
import com.pnakaj.spring.transaction.isolation.readcommited.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by pankaj on 6/3/2017.
 */

@Component
public class CustomerController {
    @Autowired
    private UserService userService;

    public void saveCustomer(Customer customer) {
        userService.saveUser(customer);
    }

    @Transactional
    public void updateCustomer(Customer customer) {
        String threadName = Thread.currentThread().getName();
        System.err.println(threadName + "- Prepare to increase customer salary");

        userService.update(customer);

        System.err.println(threadName + "- Customer salary increased by " + customer);
//        sleep(threadName);
    }

    @Transactional(isolation = Isolation.SERIALIZABLE)
    public Customer getCustomerByName(String customerName) {
        String threadName = Thread.currentThread().getName();
        System.err.println(threadName + "- Prepare to check customer salary");

        Customer customer = userService.getCustomer(customerName);

        System.err.println(threadName + "- Customer salary is " + customer.getSalary());
        sleep(threadName);
        System.err.println(customer);
        customer = userService.getCustomer(customerName);


        System.err.println(customer);
        return customer;
    }

    private void sleep(String threadName) {
        System.err.println(threadName + "- Sleeping");
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
        }
        System.err.println(threadName + "- Wake up");
    }
}

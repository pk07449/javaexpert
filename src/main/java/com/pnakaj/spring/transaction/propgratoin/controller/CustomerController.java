package com.pnakaj.spring.transaction.propgratoin.controller;

import com.pnakaj.spring.transaction.propgratoin.domain.Customer;
import com.pnakaj.spring.transaction.propgratoin.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by pankaj on 6/3/2017.
 */

@Component
public class CustomerController {
    @Autowired
    private CustomerService customerService;
    public void saveCustomer(Customer customer){
        customerService.checkout(customer);
    }
}

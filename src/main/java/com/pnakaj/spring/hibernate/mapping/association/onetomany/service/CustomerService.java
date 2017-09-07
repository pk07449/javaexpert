package com.pnakaj.spring.hibernate.mapping.association.onetomany.service;

import com.pnakaj.spring.hibernate.mapping.association.onetomany.domain.Customer;
import com.pnakaj.spring.hibernate.mapping.association.onetomany.domain.Orders;
import com.pnakaj.spring.hibernate.mapping.association.onetomany.repo.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;
import java.util.HashSet;

/**
 * Created by pankaj on 7/16/2017.
 */
@Service
public class CustomerService {

    @Autowired
    private CustomerRepo customerRepo;

    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public void saveEmployeeDetail() {

        Customer customer = new Customer(null, "pankaj", "permanent", null);
        customerRepo.saveEmployee(customer);


        Orders orders = new Orders(null, "Bihar", "DOS");
        orders.setCustomer(customer);

        customerRepo.saveOrder(orders);

        Orders order1 = new Orders(null, "Bihar", "Patna");
        order1.setCustomer(customer);
        customerRepo.saveOrder(order1);

    }
}
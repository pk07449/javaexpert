package com.pnakaj.spring.transaction.isolation.readuncommited.service;

import com.pnakaj.spring.transaction.isolation.readuncommited.domain.Customer;
import com.pnakaj.spring.transaction.isolation.readuncommited.repo.GenericRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by pankaj on 6/3/2017.
 */

@Service
@Transactional
public class CustomerService {
    @Autowired
    private GenericRepo genericRepo;

    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public void saveCustomer(Customer customer) {
        genericRepo.save(customer);
    }

    public void update(Customer customer) {
        genericRepo.update("update Customer set salary=" + customer.getSalary() + " where name='" + customer.getName() + "'");
    }

    public Customer getCustomer(String customerName) {
        return (Customer)genericRepo.get("from Customer cust where cust.name='" + customerName + "'");
    }
}

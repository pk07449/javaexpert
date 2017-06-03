package com.pnakaj.spring.transaction.propgratoin.service;

import com.pnakaj.spring.transaction.propgratoin.domain.Customer;
import com.pnakaj.spring.transaction.propgratoin.domain.Dealer;
import com.pnakaj.spring.transaction.propgratoin.domain.Employee;
import com.pnakaj.spring.transaction.propgratoin.repo.CustomerRepo;
import org.hibernate.PropertyValueException;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import static org.springframework.beans.BeanUtils.copyProperties;

/**
 * Created by pankaj on 6/3/2017.
 */

@Service
public class CustomerService {
    @Autowired
    private CustomerRepo customerRepo;

    @Transactional(propagation = Propagation.REQUIRED)
    public void saveCustomer(Customer customer) {
        customerRepo.save(customer);
    }
    @Transactional(propagation = Propagation.REQUIRED)
    public void saveEmployee(Employee employee) {
        customerRepo.save(employee);
    }
    @Transactional(propagation = Propagation.REQUIRED)
    public void saveDealer(Dealer dealer) {
        customerRepo.save(dealer);
    }


    @Transactional(rollbackFor = PropertyValueException.class, propagation = Propagation.REQUIRED)
    public void checkout(Customer customer) {
        saveCustomer(customer);

        Employee employee = new Employee();
        BeanUtils.copyProperties(customer,employee);
        saveEmployee(employee);

        Dealer dealer = new Dealer();
        BeanUtils.copyProperties(customer, dealer);
        saveDealer(dealer);



    }
}

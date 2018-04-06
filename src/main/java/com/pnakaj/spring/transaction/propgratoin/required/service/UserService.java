package com.pnakaj.spring.transaction.propgratoin.required.service;

import com.pnakaj.spring.transaction.propgratoin.required.domain.Customer;
import com.pnakaj.spring.transaction.propgratoin.required.domain.Dealer;
import com.pnakaj.spring.transaction.propgratoin.required.domain.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import static org.springframework.beans.BeanUtils.copyProperties;

/**
 * Created by pankaj on 6/3/2017.
 */

@Service
public class UserService {

    @Autowired
    private CustomerService customerService;
    @Autowired
    private EmployeeService employeeService;
    @Autowired
    private DealerService dealerService;

    @Transactional(rollbackFor = Exception.class,propagation = Propagation.REQUIRED)
    public void saveUser(Customer customer) {

        customerService.saveCustomer(customer);

        Employee employee = new Employee();
        copyProperties(customer,employee);
        employeeService.saveEmployee(employee);

        Dealer dealer = new Dealer();
        copyProperties(customer, dealer);
        dealerService.saveDealer(dealer);
    }
}

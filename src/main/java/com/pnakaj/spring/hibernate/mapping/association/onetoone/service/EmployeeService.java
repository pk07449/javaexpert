package com.pnakaj.spring.hibernate.mapping.association.onetoone.service;

import com.pnakaj.spring.hibernate.domain.Address;
import com.pnakaj.spring.hibernate.mapping.association.onetoone.domain.Employee;
import com.pnakaj.spring.hibernate.mapping.association.onetoone.repo.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by pankaj on 7/16/2017.
 */
@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepo employeeRepo;

    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public void saveEmployeeDetail() {
        Address address = new Address(null, "Bihar", "DOS");
        employeeRepo.saveAddress(address);
        employeeRepo.saveEmployee(new Employee(null,"pankaj","permanent", address));
    }
}
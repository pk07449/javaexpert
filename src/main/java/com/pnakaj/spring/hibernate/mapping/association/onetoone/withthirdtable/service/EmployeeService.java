package com.pnakaj.spring.hibernate.mapping.association.onetoone.withthirdtable.service;

import com.pnakaj.spring.hibernate.mapping.association.onetoone.withthirdtable.domain.Address;
import com.pnakaj.spring.hibernate.mapping.association.onetoone.withthirdtable.domain.Employee;
import com.pnakaj.spring.hibernate.mapping.association.onetoone.withthirdtable.repo.EmployeeRepo;
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
        System.out.println(address.getAddressId());
        Employee employee = new Employee(null, "pankaj", "permanent",address);
        employeeRepo.saveEmployee(employee, address);
    }
}
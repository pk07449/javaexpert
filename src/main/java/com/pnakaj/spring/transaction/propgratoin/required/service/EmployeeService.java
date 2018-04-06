package com.pnakaj.spring.transaction.propgratoin.required.service;

import com.pnakaj.spring.transaction.propgratoin.required.domain.Employee;
import com.pnakaj.spring.transaction.propgratoin.required.repo.GenericRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by pankaj on 6/3/2017.
 */

@Service
@Transactional
public class EmployeeService {
    @Autowired
    private GenericRepo genericRepo;

    @Transactional(propagation = Propagation.REQUIRED)
    public void saveEmployee(Employee employee) {
        genericRepo.save(employee);
    }
}

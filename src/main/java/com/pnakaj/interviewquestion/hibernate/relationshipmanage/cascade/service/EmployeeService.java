package com.pnakaj.interviewquestion.hibernate.relationshipmanage.cascade.service;

import com.pnakaj.interviewquestion.hibernate.relationshipmanage.cascade.domain.Address;
import com.pnakaj.interviewquestion.hibernate.relationshipmanage.cascade.domain.Employee;
import com.pnakaj.interviewquestion.hibernate.relationshipmanage.cascade.repo.EmployeeRepo;
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
        employeeRepo.saveEmployee(new Employee(null,"pankaj","permanent", null),address);
    }

    public void delete(int i) {
       employeeRepo.delete(i);
    }
}
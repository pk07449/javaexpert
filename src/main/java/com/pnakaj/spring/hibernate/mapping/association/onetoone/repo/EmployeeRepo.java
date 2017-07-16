package com.pnakaj.spring.hibernate.mapping.association.onetoone.repo;

import com.pnakaj.spring.hibernate.domain.Address;

import com.pnakaj.spring.hibernate.mapping.association.onetoone.domain.Employee;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.classic.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by pankaj on 7/16/2017.
 */
@Repository
public class EmployeeRepo {


    @Autowired
    private SessionFactory sessionFactory;

    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public void saveEmployee(Employee employee){

        Session currentSession = sessionFactory.getCurrentSession();
        Transaction transaction = currentSession.beginTransaction();
        currentSession.save(employee);
        transaction.commit();

    }


    public void saveAddress(Address address) {
        Session currentSession = sessionFactory.getCurrentSession();
        Transaction transaction = currentSession.beginTransaction();
      sessionFactory.getCurrentSession().save(address);
        transaction.commit();
    }



}

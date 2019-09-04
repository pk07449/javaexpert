package com.pnakaj.spring.hibernate.mapping.association.onetomany.repo;

import com.pnakaj.spring.hibernate.mapping.association.onetomany.domain.Orders;
import com.pnakaj.spring.hibernate.mapping.association.onetomany.domain.Customer;
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
public class CustomerRepo {


    @Autowired
    private SessionFactory sessionFactory;

    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public void saveEmployee(Customer customer) {
        Session currentSession = sessionFactory.getCurrentSession();
        currentSession.save(customer);
    }


    public void saveOrder(Orders orders) {
        Session currentSession = sessionFactory.getCurrentSession();
        Transaction transaction = currentSession.beginTransaction();
        currentSession.save(orders);
        transaction.commit();
    }


}

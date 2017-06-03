package com.pnakaj.spring.transaction.propgratoin.repo;

import com.pnakaj.spring.transaction.propgratoin.domain.Customer;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.classic.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by pankaj on 6/3/2017.
 */
@Repository
public class CustomerRepo {
    @Autowired
    private SessionFactory sessionFactory;

    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public void save(Object entity) {
        sessionFactory.getCurrentSession().save(entity);
    }



}

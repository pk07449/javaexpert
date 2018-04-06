package com.pnakaj.spring.transaction.propgratoin.required.repo;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by pankaj on 6/3/2017.
 */
@Repository
public class GenericRepo {
    @Autowired
    private SessionFactory sessionFactory;

    @Transactional
    public void save(Object entity) {
        sessionFactory.getCurrentSession().save(entity);
    }
}

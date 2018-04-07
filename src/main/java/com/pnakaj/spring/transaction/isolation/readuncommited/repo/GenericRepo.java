package com.pnakaj.spring.transaction.isolation.readuncommited.repo;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * Created by pankaj on 6/3/2017.
 */
@Repository
public class GenericRepo {
    @Autowired
    private SessionFactory sessionFactory;

    public void save(Object entity) {
        sessionFactory.getCurrentSession().save(entity);
    }

    public void update(String hql) {
        sessionFactory.getCurrentSession().createQuery(hql).executeUpdate();
    }

    public Object  get(String hql){
        Query query = sessionFactory.getCurrentSession().createQuery(hql);
        return query.uniqueResult();
    }
}

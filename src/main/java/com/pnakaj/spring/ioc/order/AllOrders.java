package com.pnakaj.spring.ioc.order;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by pankaj on 10/20/2017.
 */
@Component
public class AllOrders {

    @Autowired
    private List<User> user;

    public List<User> getUser(){
        return user;
    }

}

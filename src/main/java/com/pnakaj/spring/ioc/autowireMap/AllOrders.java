package com.pnakaj.spring.ioc.autowireMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * Created by pankaj on 10/20/2017.
 */
@Component
public class AllOrders {

    @Autowired
    private Map<String,User> users;

    public Map<String, User> getSingleUser() {
        return users;
    }

}

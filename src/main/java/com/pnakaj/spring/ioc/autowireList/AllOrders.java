package com.pnakaj.spring.ioc.autowireList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by pankaj on 10/20/2017.
 */
@Component
public class AllOrders {

    @Autowired
    private List<User> users;

    public List<User> getSingleUser() {
        return users;
    }

}

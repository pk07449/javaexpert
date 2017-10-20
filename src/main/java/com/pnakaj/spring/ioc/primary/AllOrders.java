package com.pnakaj.spring.ioc.primary;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

/**
 * Created by pankaj on 10/20/2017.
 */
@Component
public class AllOrders {

    @Autowired
    private User user;

    public User getSingleUser() {
        return new Customer();
    }

}

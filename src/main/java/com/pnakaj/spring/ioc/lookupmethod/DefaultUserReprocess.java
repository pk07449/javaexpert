package com.pnakaj.spring.ioc.lookupmethod;

import org.springframework.stereotype.Component;

/**
 * Created by pankaj on 10/26/2017.
 */
public class DefaultUserReprocess extends UserReProcess{

    @Override
    public boolean inMyJohndeere(User user) {
        System.out.println("DefaultUserReprocess.inMyJohndeere");
        return false;
    }
}

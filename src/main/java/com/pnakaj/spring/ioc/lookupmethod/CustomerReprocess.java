package com.pnakaj.spring.ioc.lookupmethod;

/**
 * Created by pankaj on 10/26/2017.
 */
public class CustomerReprocess extends UserReProcess{

    @Override
    public boolean inMyJohndeere(User user) {
        System.out.println("CustomerReprocess.inMyJohndeere");
        return false;
    }
}

package com.pnakaj.spring.ioc.lookupmethod;

/**
 * Created by pankaj on 10/26/2017.
 */
public class DealerReprocess extends UserReProcess{

    @Override
    public boolean inMyJohndeere(User user) {
        System.out.println("DealerReprocess.inMyJohndeere");
        return false;
    }
}

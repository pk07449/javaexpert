package com.pnakaj.junit.shoping.cart.mockito.utils;

import java.util.Date;

/**
 * Created by pankaj on 1/18/2018.
 */
public class InstantClock {

    public Date now(){
        return new Date(System.currentTimeMillis());
    }
}

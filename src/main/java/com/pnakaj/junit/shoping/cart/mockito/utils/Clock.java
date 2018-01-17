package com.pnakaj.junit.shoping.cart.mockito.utils;

import java.util.Date;

/**
 * Created by pankaj on 1/18/2018.
 */
public class Clock {

    private static InstantClock instantClock = new InstantClock();

    public static Date now(){
       return instantClock.now();
    }

    public static void freeze(long time){
        instantClock = new FakeClock(time);
    }

    public static void reset(){
        instantClock = new InstantClock();
    }
}

package com.pnakaj.junit.shoping.cart.tdd.patterns.solid.isp.afterrefactor;


/**
 * Created by pankaj on 1/20/2018.
 */
public class OldBeaterAutomaticTransmission implements Vehicle {
    private int gear = 1;

    @Override
    public void drive() {
        gear = 2;
        System.out.println("Driving...");
    }

    @Override
    public int getGear() {
        return gear;
    }


}

package com.pnakaj.junit.shoping.cart.tdd.patterns.srp.beforerefactor.isp.beforerefactor;

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
    public void changeGear(int gear) {
        System.out.println("Driver can not change the gear on the Automatic Transmission");
    }

    @Override
    public void playPod() {

        System.out.println("Car is too old to support playing a ipod");

    }

    @Override
    public int getGear() {
        return gear;
    }
}

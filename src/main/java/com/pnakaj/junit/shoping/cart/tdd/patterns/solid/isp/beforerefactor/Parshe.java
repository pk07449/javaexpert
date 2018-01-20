package com.pnakaj.junit.shoping.cart.tdd.patterns.solid.isp.beforerefactor;

/**
 * Created by pankaj on 1/20/2018.
 */
public class Parshe implements Vehicle {
    private int gear = 1;
    @Override
    public void drive() {
        System.out.println("Driving...");
    }

    @Override
    public void changeGear(int gear) {
       this.gear = gear;
    }

    @Override
    public void playPod() {

        System.out.println("Playing music from the ipod ....");

    }

    @Override
    public int getGear() {
        return gear;
    }
}

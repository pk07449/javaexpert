package com.pnakaj.junit.shoping.cart.tdd.patterns.srp.beforerefactor.isp.afterrefactor;

import com.pnakaj.junit.shoping.cart.tdd.patterns.srp.beforerefactor.isp.beforerefactor.Vehicle;

/**
 * Created by pankaj on 1/20/2018.
 */
public class Parshe implements Vehicle, ManualTransmission {

    private AuxillaryAudioControll auxillaryAudioControll = new IpodControls();
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
        auxillaryAudioControll.play();
    }

    @Override
    public int getGear() {
        return gear;
    }
}

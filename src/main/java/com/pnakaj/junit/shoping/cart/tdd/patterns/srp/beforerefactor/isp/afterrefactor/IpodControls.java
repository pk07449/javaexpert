package com.pnakaj.junit.shoping.cart.tdd.patterns.srp.beforerefactor.isp.afterrefactor;

/**
 * Created by pankaj on 1/20/2018.
 */
public class IpodControls implements AuxillaryAudioControll {


    @Override
    public void play() {
        System.out.println("Playing music from the ipod ....");
    }
}

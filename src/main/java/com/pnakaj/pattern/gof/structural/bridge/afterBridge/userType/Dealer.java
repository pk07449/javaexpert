package com.pnakaj.pattern.gof.structural.bridge.afterBridge.userType;

/**
 * Created by pankaj on 9/27/2019.
 */

public class Dealer implements User {
    @Override
    public double discount() {
        return 0;
    }

    @Override
    public double discountDecider() {
        return 0;
    }
}

package com.pnakaj.pattern.gof.structural.bridge.beforeBridge.orderType;

/**
 * Created by pankaj on 9/27/2019.
 */
public class FactoryOrder implements Order {
    @Override
    public int noOfSubscription() {
        return 0;
    }

    @Override
    public int noOfActivation() {
        return 0;
    }
}

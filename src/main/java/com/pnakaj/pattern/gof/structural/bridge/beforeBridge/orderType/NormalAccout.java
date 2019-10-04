package com.pnakaj.pattern.gof.structural.bridge.beforeBridge.orderType;

import com.pnakaj.pattern.gof.structural.bridge.beforeBridge.userType.User;

/**
 * Created by pankaj on 9/27/2019.
 */
public class NormalAccout implements User {
    @Override
    public double discount() {
        return 0;
    }

    @Override
    public double discountDecider() {
        return 0;
    }
}

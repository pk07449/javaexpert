package com.pnakaj.pattern.solid.ocp.goodcode;

/**
 * Created by pankaj on 3/31/2018.
 */
public class SprayerAsset implements Asset {

    private Sprayer sprayer;
    public SprayerAsset(Sprayer sprayer){
        this.sprayer = sprayer;
    }
    @Override
    public double totalPrice() {
        return 0;
    }
}

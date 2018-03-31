package com.pnakaj.pattern.solid.ocp.goodcode;

/**
 * Created by pankaj on 3/31/2018.
 */
public class TractorAsset implements Asset {

    private Tractor tractor;
    public TractorAsset(Tractor Tractor){
        this.tractor = tractor;
    }
    @Override
    public double totalPrice() {
        return 0;
    }
}

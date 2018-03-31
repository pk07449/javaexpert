package com.pnakaj.pattern.solid.ocp.goodcode;

/**
 * Created by pankaj on 3/31/2018.
 */
public class HarvestoreAsset implements Asset {

    private Harvestor harvestor;
    public HarvestoreAsset(Harvestor harvestor){
        this.harvestor = harvestor;
    }
    @Override
    public double totalPrice() {
        return 0;
    }
}

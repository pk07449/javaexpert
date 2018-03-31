package com.pnakaj.pattern.solid.ocp.goodcode;

/**
 * Created by pankaj on 3/31/2018.
 */
public class AssetPriceCalculatorService {

    public double totalMrp(Asset asset) {
        return asset.totalPrice();
    }
}

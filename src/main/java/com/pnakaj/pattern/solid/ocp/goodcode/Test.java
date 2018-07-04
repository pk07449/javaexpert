package com.pnakaj.pattern.solid.ocp.goodcode;

import com.pnakaj.pattern.solid.ocp.goodcode.AssetPriceCalculatorService;
import com.pnakaj.pattern.solid.ocp.goodcode.Harvestor;

/**
 * Created by pankaj on 7/3/2018.
 */
public class Test {
    public static void main(String[] args) {
        double harvestorTotalPrice = new AssetPriceCalculatorService().totalMrp(new HarvestoreAsset(new Harvestor()));
        System.out.println(harvestorTotalPrice);
    }
}

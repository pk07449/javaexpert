package com.pnakaj.pattern.solid.ocp.badCode;

/**
 * Created by pankaj on 7/3/2018.
 */
public class Test {
    public static void main(String[] args) {
        double harvestorTotalPrice = new AssetPriceCalculatorService().totalMrp(new Harvestor());
        System.out.println(harvestorTotalPrice);
    }
}

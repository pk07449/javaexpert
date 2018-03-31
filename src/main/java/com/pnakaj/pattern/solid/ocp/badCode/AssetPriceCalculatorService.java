package com.pnakaj.pattern.solid.ocp.badCode;

/**
 * Created by pankaj on 3/31/2018.
 */
public class AssetPriceCalculatorService {

    public double totalMrp(Object asset) {
        if (asset instanceof Harvestor) {
            return harvestorTotalMrp();
        } else if (asset instanceof Sprayer) {
            return sprayerTotalMrp();
        } else if (asset instanceof Tractor) {
            return tractorTotalMrp();
        }
        return 0.00;
    }

    private double tractorTotalMrp() {
        return 0;
    }

    private double sprayerTotalMrp() {
        return 0;
    }

    private double harvestorTotalMrp() {
        return 0;
    }


}

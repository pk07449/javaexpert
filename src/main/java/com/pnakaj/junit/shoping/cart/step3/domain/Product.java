package com.pnakaj.junit.shoping.cart.step3.domain;

/**
 * Created by pankaj on 1/14/2018.
 */
public enum Product {

    DOVE(39.99,12.5),
    AXE_DEO(99.99,12.5);

    private double mrp;
    private double tax;

    Product(double mrp, double tax) {
        this.mrp = mrp;
        this.tax = tax;
    }

    public double getMrp() {
        return this.mrp;
    }

    public double getTax() {
        return tax;
    }
}

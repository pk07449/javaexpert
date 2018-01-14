package com.pnakaj.junit.shoping.cart.step2.domain;

/**
 * Created by pankaj on 1/14/2018.
 */
public enum Product {

    DOVE(39.99);

    private double mrp;
    Product(double mrp) {
        this.mrp = mrp;
    }

    public double getMrp() {
        return this.mrp;
    }

}

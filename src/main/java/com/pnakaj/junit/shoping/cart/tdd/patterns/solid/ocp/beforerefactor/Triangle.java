package com.pnakaj.junit.shoping.cart.tdd.patterns.solid.ocp.beforerefactor;

/**
 * Created by pankaj on 1/20/2018.
 */
public class Triangle {

    private int base;
    private int height;


    public Triangle(int base, int height) {
        this.base = base;
        this.height = height;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

}

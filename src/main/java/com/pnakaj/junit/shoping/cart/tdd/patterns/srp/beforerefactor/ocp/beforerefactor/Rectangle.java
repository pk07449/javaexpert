package com.pnakaj.junit.shoping.cart.tdd.patterns.srp.beforerefactor.ocp.beforerefactor;

/**
 * Created by pankaj on 1/20/2018.
 */
public class Rectangle {
    private int height;
    private int width;

    public Rectangle(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }
}

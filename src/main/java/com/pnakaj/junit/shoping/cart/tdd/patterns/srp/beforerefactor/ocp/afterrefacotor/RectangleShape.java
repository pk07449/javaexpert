package com.pnakaj.junit.shoping.cart.tdd.patterns.srp.beforerefactor.ocp.afterrefacotor;

/**
 * Created by pankaj on 1/20/2018.
 */
public class RectangleShape implements Shape {

    private int height;
    private int width;

    public RectangleShape(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

        @Override
    public double area() {
        return this.getHeight() * this.getWidth();
    }
}

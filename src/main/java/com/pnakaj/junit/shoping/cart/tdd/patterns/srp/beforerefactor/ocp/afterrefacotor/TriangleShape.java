package com.pnakaj.junit.shoping.cart.tdd.patterns.srp.beforerefactor.ocp.afterrefacotor;

/**
 * Created by pankaj on 1/20/2018.
 */
public class TriangleShape implements Shape {

    private int base;
    private int height;


    public TriangleShape(int base, int height) {
        this.base = base;
        this.height = height;
    }

    public int getBase() {
        return base;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public double area() {
        return this.getHeight() * this.getBase() / 2;
    }
}

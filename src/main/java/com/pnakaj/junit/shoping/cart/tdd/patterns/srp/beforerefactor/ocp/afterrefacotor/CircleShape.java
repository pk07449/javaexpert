package com.pnakaj.junit.shoping.cart.tdd.patterns.srp.beforerefactor.ocp.afterrefacotor;

/**
 * Created by pankaj on 1/20/2018.
 */
public class CircleShape implements Shape {
    private int radius;

    public int getRadius() {
        return radius;
    }

    public CircleShape(int radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * Math.pow(this.getRadius(), 2);
    }
}

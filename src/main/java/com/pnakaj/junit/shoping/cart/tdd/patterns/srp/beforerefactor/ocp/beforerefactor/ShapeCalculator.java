package com.pnakaj.junit.shoping.cart.tdd.patterns.srp.beforerefactor.ocp.beforerefactor;

/**
 * Created by pankaj on 1/20/2018.
 */
public class ShapeCalculator {
    public double calculateArea(Object shape) {
        if (shape instanceof Circle) {
            return cicleArea((Circle) shape);
        } else if (shape instanceof Rectangle) {
            return rectangleArea((Rectangle) shape);
        } else if (shape instanceof Triangle) {
            return triangleArea((Triangle) shape);
        }
        throw new UnsupportedOperationException();

    }

    private double triangleArea(Triangle shape) {
        return shape.getHeight() * shape.getBase() / 2;
    }

    private double rectangleArea(Rectangle shape) {
        return shape.getHeight() * shape.getWidth();
    }

    private double cicleArea(Circle shape) {
        return Math.PI * Math.pow(shape.getRadius(), 2);
    }
}

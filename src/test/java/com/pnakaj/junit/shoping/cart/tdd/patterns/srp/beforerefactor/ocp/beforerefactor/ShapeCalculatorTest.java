package com.pnakaj.junit.shoping.cart.tdd.patterns.srp.beforerefactor.ocp.beforerefactor;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by pankaj on 1/20/2018.
 */
public class ShapeCalculatorTest {

    @Test
    public void calculateAreaOfCircle() throws Exception {
        ShapeCalculator shapeCalculator = new ShapeCalculator();
        double v = shapeCalculator.calculateArea(new Circle(5));
        assertEquals(78.53,v,0.2);

    }

    @Test
    public void calculateAreaOfRectangle() throws Exception {
        ShapeCalculator shapeCalculator = new ShapeCalculator();
        double v = shapeCalculator.calculateArea(new Rectangle(5,7));
        assertEquals(35,v,0.2);

    }

    @Test
    public void calculateAreaOfTriangle() throws Exception {
        ShapeCalculator shapeCalculator = new ShapeCalculator();
        double v = shapeCalculator.calculateArea(new Triangle(5,7));
        assertEquals(17.0,v,0.00);

    }
}
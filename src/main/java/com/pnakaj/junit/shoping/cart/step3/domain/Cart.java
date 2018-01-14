package com.pnakaj.junit.shoping.cart.step3.domain;

import java.util.Collections;
import java.util.List;

/**
 * Created by pankaj on 1/14/2018.
 */
public class Cart {
    private List<Product> products = Collections.EMPTY_LIST;
    private double totalPrice;
    private double totalTax;


    public List<Product> getProducts() {
        return products;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public Cart(List<Product> products, double totalPrice, double totalTax) {
        this.products = products;
        this.totalTax = totalTax;
        this.totalPrice = totalPrice;
    }

    public double getTotalTax() {
        return totalTax;
    }
}

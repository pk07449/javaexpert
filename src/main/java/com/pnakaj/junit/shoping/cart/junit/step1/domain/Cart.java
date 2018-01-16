package com.pnakaj.junit.shoping.cart.junit.step1.domain;

import java.util.Collections;
import java.util.List;

/**
 * Created by pankaj on 1/14/2018.
 */
public class Cart {
    private List<Product> products = Collections.EMPTY_LIST;
    private double totalPrice;

    public Cart(List<Product> products, double totalPrice) {
        this.products = products;
        this.totalPrice = totalPrice;
    }

    public List<Product> getProducts() {
        return products;
    }

    public double getTotalPrice() {
        return totalPrice;
    }
}

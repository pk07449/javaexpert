package com.pnakaj.junit.shoping.cart.junit.step1.service;

import com.pnakaj.junit.shoping.cart.junit.step1.domain.Cart;
import com.pnakaj.junit.shoping.cart.junit.step1.domain.Product;

import java.util.ArrayList;
import java.util.List;

public class CartService {

    private List<Product> products = new ArrayList<>();

    public void addProducts(List<Product> products) {
        this.products.addAll(products);
    }

    public Cart checkoutProducts() {
        return new Cart(products, products.stream().mapToDouble(p -> p.getMrp()).sum());
    }
}


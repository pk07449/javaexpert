package com.pnakaj.junit.shoping.cart.step2.service;

import com.pnakaj.junit.shoping.cart.step2.domain.Cart;
import com.pnakaj.junit.shoping.cart.step2.domain.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class CartService {

    private List<Product> products = new ArrayList<>();

    public void addProducts(List<Product> products) {
        this.products.addAll(products);
    }

    public Cart checkoutProducts() {
        Stream<Product> stream = products.stream();
        return new Cart(products, stream.mapToDouble(Product::getMrp).sum());
    }
}


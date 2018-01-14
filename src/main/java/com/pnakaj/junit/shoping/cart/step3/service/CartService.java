package com.pnakaj.junit.shoping.cart.step3.service;

import com.pnakaj.junit.shoping.cart.step3.domain.Cart;
import com.pnakaj.junit.shoping.cart.step3.domain.Product;

import java.util.ArrayList;
import java.util.List;

public class CartService {

    private List<Product> products = new ArrayList<>();

    public void addProducts(List<Product> products) {
        this.products.addAll(products);
    }

    public Cart getCheckoutProducts() {
        double totalTax = Math.round(products.stream().mapToDouble(p -> p.getMrp() * p.getTax() / 100).sum());
        return new Cart(products,
                products.stream().mapToDouble(Product::getMrp).sum() + totalTax,
                totalTax);
    }
}


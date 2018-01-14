package com.pnakaj.junit.shoping.cart.step1.service;

import com.pnakaj.junit.shoping.cart.step1.domain.Cart;
import com.pnakaj.junit.shoping.cart.step1.domain.Product;
import org.junit.Before;
import org.junit.Test;

import java.util.Collections;
import java.util.List;

import static com.pnakaj.junit.shoping.cart.step1.domain.Product.*;
import static java.util.Arrays.asList;
import static org.junit.Assert.*;

/**
 * Created by pankaj on 1/15/2018.
 */
public class CartServiceTest {
    private CartService cartService;

    @Before
    public void setUp() {
        cartService = new CartService();
    }

    @Test
    public void cartShouldBeEmptyWhenUserHasNotAddedAnyProduct() throws Exception {
        Cart actualCart = cartService.checkoutProducts();

        assertEquals(0.00, actualCart.getTotalPrice(),0.0001);

        assertEquals(Collections.EMPTY_LIST, actualCart.getProducts());
    }

    @Test
    public void cartShouldContainFiveProductWhenUserAddedFiveProductInCart() {
        List<Product> expectedProducts = asList(DOVE, DOVE, DOVE, DOVE, DOVE);
        cartService.addProducts(expectedProducts);

        Cart actualCart = cartService.checkoutProducts();

        assertEquals(199.950, actualCart.getTotalPrice(),0.0001);
        assertEquals(expectedProducts, actualCart.getProducts());
    }

    @Test
    public void cartShouldContainTotalPriceOfAllProductWhenUserAddedFiveProductInCart() {
        cartService.addProducts(asList(DOVE, DOVE, DOVE, DOVE, DOVE));

        Cart actualCart = cartService.checkoutProducts();

        assertEquals(199.951, actualCart.getTotalPrice(), 0.001);
    }

}
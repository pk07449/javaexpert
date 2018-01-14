package com.pnakaj.junit.shoping.cart.step2.service;

import com.pnakaj.junit.shoping.cart.step2.domain.Cart;
import com.pnakaj.junit.shoping.cart.step2.domain.Product;
import org.junit.Before;
import org.junit.Test;

import java.util.Collections;
import java.util.List;

import static com.pnakaj.junit.shoping.cart.step2.domain.Product.DOVE;
import static java.util.Arrays.asList;
import static org.junit.Assert.*;

/**
 * Created by pankaj on 1/15/2018.
 */
public class CartServiceTest {
    private CartService cartService;

    @Before
    public void setUp() {
        cartService = new com.pnakaj.junit.shoping.cart.step2.service.CartService();
    }

    @Test
    public void cartShouldBeEmptyWhenUserHasNotAddedAnyProduct() {
        Cart actualCart = cartService.checkoutProducts();

        assertEquals(0.00, actualCart.getTotalPrice(),0.001);

        assertEquals(Collections.EMPTY_LIST, actualCart.getProducts());
    }

    @Test
    public void cartShouldContainEightProductWhenUserAddedFiveAndThenThreeProductInCart() {
        List<Product> expectedProducts = asList(DOVE, DOVE, DOVE, DOVE, DOVE,DOVE, DOVE, DOVE);
        cartService.addProducts(asList(DOVE, DOVE, DOVE, DOVE, DOVE));
        cartService.addProducts(asList(DOVE, DOVE, DOVE));

        Cart actualCart = cartService.checkoutProducts();

        assertEquals(expectedProducts, actualCart.getProducts());
    }

    @Test
    public void cartShouldContainTotalPriceOfAllProductWhenUserAddedFiveProductInCart() {
        cartService.addProducts(asList(DOVE, DOVE, DOVE, DOVE, DOVE));
        cartService.addProducts(asList(DOVE, DOVE, DOVE));

        Cart actualCart = cartService.checkoutProducts();

        assertEquals(319.92, actualCart.getTotalPrice(), 0.001);
    }
}
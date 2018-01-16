package com.pnakaj.junit.shoping.cart.junit.step3.service;

import com.pnakaj.junit.shoping.cart.junit.step3.domain.Cart;
import com.pnakaj.junit.shoping.cart.junit.step3.domain.Product;
import org.junit.Before;
import org.junit.Test;

import java.util.Collections;
import java.util.List;

import static com.pnakaj.junit.shoping.cart.junit.step3.domain.Product.AXE_DEO;
import static com.pnakaj.junit.shoping.cart.junit.step3.domain.Product.DOVE;
import static java.util.Arrays.asList;
import static org.junit.Assert.*;

/**
 * Created by pankaj on 1/15/2018.
 */
public class CartServiceTest {
    private com.pnakaj.junit.shoping.cart.junit.step3.service.CartService cartService;

    @Before
    public void setUp() {
        cartService = new com.pnakaj.junit.shoping.cart.junit.step3.service.CartService();
    }

    @Test
    public void cartShouldBeEmptyWhenUserHasNotAddedAnyProduct() {
        Cart actualCart = cartService.getCheckoutProducts();
        assertEquals(0.00, actualCart.getTotalPrice(), 0.001);
        assertEquals(Collections.EMPTY_LIST, actualCart.getProducts());
    }

    @Test
    public void cartShouldContainTwoDoveAndTwoAxeDeoProductWhenUserAddedTwoDoveAndTwoDeo() {
        List<Product> expectedProducts = asList(DOVE, DOVE, AXE_DEO, AXE_DEO);
        cartService.addProducts(asList(DOVE, DOVE, AXE_DEO, AXE_DEO));

        Cart actualCart = cartService.getCheckoutProducts();

        assertEquals(expectedProducts, actualCart.getProducts());
    }

    @Test
    public void cartShouldContainTotalTwoDoveAndTwoAxeDeoWhenUserAddedFiveProductInCart() {
        cartService.addProducts(asList(DOVE, DOVE, AXE_DEO, AXE_DEO));

        Cart actualCart = cartService.getCheckoutProducts();

        actualCart.getProducts().stream().filter(DOVE::equals)
                .forEach(product -> assertEquals(39.99, product.getMrp(),0.001));
        actualCart.getProducts().stream().filter(DOVE::equals)
                .forEach(product -> assertEquals(39.99, product.getMrp(),0.001));
    }

    @Test
    public void cartShouldContainTotalTaxAndTotalPrice() {
        cartService.addProducts(asList(DOVE, DOVE, AXE_DEO, AXE_DEO));

        Cart actualCart = cartService.getCheckoutProducts();

        assertEquals(35, actualCart.getTotalTax(),0.001);
        assertEquals(314.96, actualCart.getTotalPrice(),0.001);
    }

}
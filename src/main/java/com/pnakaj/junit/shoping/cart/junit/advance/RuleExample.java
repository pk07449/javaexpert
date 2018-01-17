package com.pnakaj.junit.shoping.cart.junit.advance;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.TemporaryFolder;
import org.junit.rules.Timeout;

/**
 * Created by pankaj on 1/18/2018.
 */

public class RuleExample {

    @Rule
    public Timeout timeout = new Timeout(1000);
    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Test
    public void firstMethod() throws InterruptedException {
        System.out.println("@Test - firstMethod");
        Thread.sleep(5000);
    }

    @Test
    public void secondtMethod() throws InterruptedException {
        System.out.println("@Test - secondtMethod");
        Thread.sleep(5000);
    }

    @Test(expected = RuntimeException.class)
    public void thirdMethod() throws Exception {
        Assert.assertEquals("pankaj", "pankaj");
    }

    @Test
    public void fourMethod() throws Exception {
        Assert.assertEquals("pankaj","pankaj");
        expectedException.expect(RuntimeException.class);


    }



}





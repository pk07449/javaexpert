package com.pnakaj.junit.shoping.cart.junit.advance.parameterizedTest;

/**
 * Created by pankaj on 1/18/2018.
 */

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

import static java.util.Arrays.asList;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

@RunWith(Parameterized.class)
public class ParameterizedTest {

    //default value = 0
    @Parameter(value = 0)
    public int numberA;

    @Parameter(value = 1)
    public int numberB;

    @Parameter(value = 2)
    public int expected;

    @Parameters(name = "{index}: testAdd({0}+{1}) = {2}")
    public static Collection<Object[]> data() {
        return asList(new Object[][]{
                {1, 1, 2},
                {2, 2, 4},
                {8, 2, 10},
                {4, 5, 9},
                {5, 5, 10}
        });
    }

    @Test
    public void test_addTwoNumbes() {
        System.out.println("ParameterizedTest.test_addTwoNumbes");
        assertThat(Calculator.add(numberA, numberB), is(expected));
    }

}



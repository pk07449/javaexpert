package com.pnakaj.junit.shoping.cart.junit.advance.runMultipleSuiteClasses;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * Created by pankaj on 1/18/2018.
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({FirstTest.class,SecondTest.class,ThirdTest.class})
public class CustomSuits {

}

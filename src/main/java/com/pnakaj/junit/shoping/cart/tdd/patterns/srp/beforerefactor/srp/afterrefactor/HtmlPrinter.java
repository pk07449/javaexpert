package com.pnakaj.junit.shoping.cart.tdd.patterns.srp.beforerefactor.srp.afterrefactor;

/**
 * Created by pankaj on 1/20/2018.
 */
public class HtmlPrinter implements Printer {
    @Override
    public String printPage(String page) {
        return "<div class='page'>" +page + "</div>";
    }
}

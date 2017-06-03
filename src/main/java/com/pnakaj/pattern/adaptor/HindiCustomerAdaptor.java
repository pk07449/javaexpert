package com.pnakaj.pattern.adaptor;

/**
 * Created by pankaj on 2/5/2017.
 */
public class HindiCustomerAdaptor extends EnglishCustomer implements IHindiCustomer {

    EnglishCustomer englishCustomer;

    public HindiCustomerAdaptor(EnglishCustomer englishCustomer) {
        {
            this.englishCustomer = englishCustomer;
        }
    }

    public void jodo() {
        englishCustomer.add();
    }
}

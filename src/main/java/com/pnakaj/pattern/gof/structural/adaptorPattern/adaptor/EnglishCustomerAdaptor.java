package com.pnakaj.pattern.gof.structural.adaptorPattern.adaptor;

import com.pnakaj.pattern.gof.structural.adaptorPattern.adaptee.EnglishCustomer;
import com.pnakaj.pattern.gof.structural.adaptorPattern.target.IHindiCustomer;

/**
 * Created by pankaj on 2/5/2017.
 */
public class EnglishCustomerAdaptor extends EnglishCustomer implements IHindiCustomer {

    EnglishCustomer englishCustomer;

    public EnglishCustomerAdaptor(EnglishCustomer englishCustomer) {
        {
            this.englishCustomer = englishCustomer;
        }
    }

    public void jodo() {
        super.add();
    }
}

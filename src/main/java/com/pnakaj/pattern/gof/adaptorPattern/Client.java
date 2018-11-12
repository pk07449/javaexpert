package com.pnakaj.pattern.gof.adaptorPattern;

import com.pnakaj.pattern.gof.adaptorPattern.adaptee.EnglishCustomer;
import com.pnakaj.pattern.gof.adaptorPattern.adaptor.EnglishCustomerAdaptor;
import com.pnakaj.pattern.gof.adaptorPattern.target.HindiCustomer;
import com.pnakaj.pattern.gof.adaptorPattern.target.IHindiCustomer;

public class Client {
    public static void main(String[] args) {
        IHindiCustomer hindiCustomer =  new HindiCustomer();
        hindiCustomer.jodo();

        hindiCustomer = new EnglishCustomerAdaptor(new EnglishCustomer());
        hindiCustomer.jodo();
    }
}

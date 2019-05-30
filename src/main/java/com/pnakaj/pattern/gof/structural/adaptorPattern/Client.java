package com.pnakaj.pattern.gof.structural.adaptorPattern;

import com.pnakaj.pattern.gof.structural.adaptorPattern.adaptee.EnglishCustomer;
import com.pnakaj.pattern.gof.structural.adaptorPattern.adaptor.EnglishCustomerAdaptor;
import com.pnakaj.pattern.gof.structural.adaptorPattern.target.HindiCustomer;
import com.pnakaj.pattern.gof.structural.adaptorPattern.target.IHindiCustomer;

public class Client {
    public static void main(String[] args) {
        IHindiCustomer hindiCustomer =  new HindiCustomer();
        hindiCustomer.jodo();

        hindiCustomer = new EnglishCustomerAdaptor(new EnglishCustomer());
        hindiCustomer.jodo();
    }
}

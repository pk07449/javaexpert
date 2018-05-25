package com.pnakaj.pattern.gof.adaptor;

public class Client {
    public static void main(String[] args) {
        IHindiCustomer hindiCustomer = new HindiCustomerAdaptor(new EnglishCustomer());
        hindiCustomer.jodo();
    }

}

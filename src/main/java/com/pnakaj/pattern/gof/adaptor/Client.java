package com.pnakaj.pattern.gof.adaptor;

public class Client {
    public static void main(String[] args) {
        new HindiCustomerAdaptor(new EnglishCustomer()).jodo();
    }

}

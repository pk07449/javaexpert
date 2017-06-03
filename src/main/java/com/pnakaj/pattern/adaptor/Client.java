package com.pnakaj.pattern.adaptor;

public class Client {
    public static void main(String[] args) {
        new HindiCustomerAdaptor(new EnglishCustomer()).jodo();
    }

}

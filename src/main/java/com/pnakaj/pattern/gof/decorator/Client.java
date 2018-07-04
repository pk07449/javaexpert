package com.pnakaj.pattern.gof.decorator;

/**
 * Created by pankaj on 3/12/2017.
 */
public class Client {
    public static void main(String[] args) {
        System.out.println(new ExternalDecorator(new Email("Test Mail")).getContents());
    }
}

package com.pnakaj.pattern.gof.decorator;

/**
 * Created by pankaj on 3/12/2017.
 */
public class Client


{
    public static void main(String[] args) {

        IEmail email = new Email();

        EmailDecorator emailDecorator = new ExternalDecorator();





    }
}

package com.pnakaj.pattern.gof.decoratorPattern;

/**
 * Created by pankaj on 3/12/2017.
 */
public class Client {
    public static void main(String[] args) {
        IEmail basicEmail = new Email("Test Mail");
        System.out.println(basicEmail.getContents());

        IEmail decoratorEmail = new ExternalEmailDecorator(basicEmail);
        System.out.println(decoratorEmail.getContents());
    }
}

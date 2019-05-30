package com.pnakaj.pattern.gof.structural.decoratorPattern;

/**
 * Created by pankaj on 3/12/2017.
 */
public class ExternalEmailDecorator implements IEmail {

    private String content;
    private IEmail originalEmail;

    public ExternalEmailDecorator(IEmail basicEmail) {
        originalEmail = basicEmail;
    }

    @Override
    public String getContents() {
        return originalEmail.getContents() + "\n Company Disclaimer";
    }

}



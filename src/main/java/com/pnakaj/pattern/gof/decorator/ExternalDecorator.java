package com.pnakaj.pattern.gof.decorator;

/**
 * Created by pankaj on 3/12/2017.
 */
public class ExternalDecorator extends EmailDecorator {

    private String content;
    private IEmail originalEmail;

    public ExternalDecorator(IEmail basicEmail) {
        originalEmail = basicEmail;
    }

    @Override
    public String getContents() {
        return originalEmail.getContents() + "\n Company Disclaimer";
    }

}



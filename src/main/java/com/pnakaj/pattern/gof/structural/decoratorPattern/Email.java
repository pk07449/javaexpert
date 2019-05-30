package com.pnakaj.pattern.gof.structural.decoratorPattern;

/**
 * Created by pankaj on 3/12/2017.
 */
public class Email implements IEmail {

    private String content;

    public Email(String content) {
        this.content = content;
    }

    @Override
    public String getContents() {
        return content;
    }

}

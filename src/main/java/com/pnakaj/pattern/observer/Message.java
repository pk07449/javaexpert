package com.pnakaj.pattern.observer;

/**
 * Created by pankaj on 8/12/2017.
 */
public class Message {
    private String name;
    private String messageDetail;

    public Message(String name, String messageDetail) {
        this.name = name;
        this.messageDetail = messageDetail;
    }

    public String getName() {
        return name;
    }

    public String getMessageDetail() {
        return messageDetail;
    }
}

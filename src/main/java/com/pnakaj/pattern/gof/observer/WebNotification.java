package com.pnakaj.pattern.gof.observer;

/**
 * Created by pankaj on 8/12/2017.
 */
public class WebNotification implements Notification{
    @Override
    public void send(Message message) {
        System.out.println("Web Notification : " + message);
    }
}

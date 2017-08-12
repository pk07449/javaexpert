package com.pnakaj.pattern.observer;

/**
 * Created by pankaj on 8/12/2017.
 */
public class EmailNotification  implements Notification{
    @Override
    public void send(Message message) {
        System.out.println("EmailNotificatio : " + message);
    }
}

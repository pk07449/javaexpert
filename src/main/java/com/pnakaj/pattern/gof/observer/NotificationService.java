package com.pnakaj.pattern.gof.observer;

/**
 * Created by pankaj on 8/12/2017.
 */
public class NotificationService {
    private NotificationObserver notificationObserver;

    public NotificationService(NotificationObserver notificationObserver) {
        this.notificationObserver = notificationObserver;
    }

    public void send(Message message) {
        notificationObserver.notifyNotification(message);
    }
}

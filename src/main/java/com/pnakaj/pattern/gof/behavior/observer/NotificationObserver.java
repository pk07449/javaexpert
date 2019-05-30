package com.pnakaj.pattern.gof.behavior.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by pankaj on 4/1/2018.
 */
public class NotificationObserver {

    private List<Notification> notifications = new ArrayList<>();

    public void addObserver(Notification notification) {
        notifications.add(notification);
    }

    public void removeObserver(Notification notification) {
        notifications.remove(notification);
    }

    public List<Notification> getNotifications() {
        return notifications;
    }

    public void notifyNotification(Message message) {
        notifications.forEach(notification -> notification.send(message));
    }
}

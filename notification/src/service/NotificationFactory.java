package service;

import model.EmailNotification;
import model.Notification;
import model.NullNotification;
import model.PushNotification;
import model.SMSNotification;

public final class NotificationFactory {

    public Notification createNotification(String tipo) {

        if (tipo == null) {
            return new NullNotification();
        }
        tipo = tipo.toLowerCase();

        switch (tipo) {
            case "email":
                return new EmailNotification();
            case "push":
                return new PushNotification();
            case "sms":
                return new SMSNotification();

            default:
                return new NullNotification();
        }
    }
}

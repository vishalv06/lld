package designpatterns.creational.factory;

import java.util.Objects;

public class NotificationFactory {

    public static Notification getNotification(String type) {
        if (Objects.equals(type, "EMAIL")) {
            return new EmailNotification();
        } else if (Objects.equals(type, "SMS")) {
            return new SMSNotification();
        } else if (Objects.equals(type, "PUSH")) {
            return new PushNotification();
        }
        return new Notification() {
            @Override
            public void notifyUser() {
                System.out.println("Provide notification type");
            }
        };
    }
}

package designpatterns.creational.factory;

public class TestNotificationFactory {

    public static void main(String[] args) {
        Notification notification1 = NotificationFactory.getNotification("EMAIL");
        Notification notification2 = NotificationFactory.getNotification("PUSH");
        notification1.notifyUser();
        notification2.notifyUser();
    }
}

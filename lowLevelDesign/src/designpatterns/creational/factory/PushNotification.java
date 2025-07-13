package designpatterns.creational.factory;

public class PushNotification implements Notification{

    @Override
    public void notifyUser() {
        System.out.println("Sending PUSH notification");
    }
}

package solid.ocp.notification;

public class WhatsappSender implements NotificationSender{
    @Override
    public void sendNotification(String message) {
        System.out.println("Sending whatsapp message: " + message);
    }
}

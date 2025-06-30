import ocp.notification.EmailSender;
import ocp.notification.NotificationSender;
import ocp.notification.NotificationService;
import ocp.notification.WhatsappSender;

public class Main {
    public static void main(String[] args) {

        NotificationSender notificationSender = new EmailSender();
        NotificationService notificationService = new NotificationService(notificationSender, "Hello");
        notificationService.sendNotification();

        NotificationSender notificationSenderW = new WhatsappSender();
        NotificationService notificationServiceW = new NotificationService(notificationSenderW, "Hello from whatsapp");
        notificationServiceW.sendNotification();


    }
}
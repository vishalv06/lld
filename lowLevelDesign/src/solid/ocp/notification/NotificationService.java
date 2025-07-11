package solid.ocp.notification;

public class NotificationService {

    private String message;

    private NotificationSender notificationSender;

    public NotificationService(NotificationSender notificationSender, String message) {
        this.notificationSender = notificationSender;
        this.message = message;
    }

    public void sendNotification(){
        notificationSender.sendNotification(message);
    }

    //    public void sendNotification(String type, String message) {
//        if (type.equals("EMAIL")) {
//            System.out.println("Sending email " + message);
//        } else if(type.equals("SMS")) {
//            System.out.println("Sending SMS " + message);
//        }
//    }
}

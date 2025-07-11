package solid.dip;

public class NotificationEmail {

    interface NotificationService {
        void sendNotification(String message);
    }

    static class EmailNotification implements NotificationService {

        @Override
        public void sendNotification(String message) {
            System.out.println("Sending email: " + message);
        }
    }

    static class Notification {

        private NotificationService notificationService;

        public Notification(NotificationService notificationService) {
            this.notificationService = notificationService;
        }

        public void notify(String message) {
            notificationService.sendNotification(message);
        }
    }

    public static void main(String[] args) {
        NotificationService notificationService = new EmailNotification();
        Notification notification = new Notification(notificationService);
        notification.notify("Welcome to the system");
    }
}

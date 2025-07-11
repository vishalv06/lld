package solid.project.ecomm;

import javax.swing.plaf.basic.BasicSplitPaneUI;

public class Ecomm {

    interface OrderProcessor {
        void processOrder();
    }

    static class PhysicalProductOrder implements OrderProcessor {

        @Override
        public void processOrder() {
            System.out.println("Processing physical order...");
        }
    }

    static class DigitalOrder implements OrderProcessor {

        @Override
        public void processOrder() {
            System.out.println("Processing digital order...");
        }
    }

    static class ServiceOrder implements OrderProcessor {

        @Override
        public void processOrder() {
            System.out.println("Processing service order...");
        }
    }

    interface NotificationService {
        void sendNotification(String message);
    }

    static class EmailNotification implements NotificationService {

        @Override
        public void sendNotification(String message) {
            System.out.println("Sending EMAIL: " + message);
        }
    }

    static class SMSNotification implements NotificationService {

        @Override
        public void sendNotification(String message) {
            System.out.println("Sending SMS: " + message);
        }
    }

    interface Logger {
        void log(String logMessage);
    }

    static class FileLogger implements Logger {

        @Override
        public void log(String logMessage) {
            System.out.println("File Logging: " + logMessage);
        }
    }

    static class ConsoleLogger implements Logger {

        @Override
        public void log(String logMessage) {
            System.out.println("Logging: " + logMessage);
        }
    }

    static class OrderService {

        private OrderProcessor orderProcessor;
        private NotificationService notificationService;
        private Logger logger;

        public OrderService(OrderProcessor orderProcessor, NotificationService notificationService, Logger logger) {
            this.orderProcessor = orderProcessor;
            this.notificationService = notificationService;
            this.logger = logger;
        }

        public void proccessOrder() {
            orderProcessor.processOrder();
        }

        public void sendNotify(String message) {
            notificationService.sendNotification(message);
        }

        public void addLog(String log) {
            logger.log(log);
        }
    }

    public static void main(String[] args) {

        OrderProcessor orderProcessor = new PhysicalProductOrder();
        NotificationService notificationService = new EmailNotification();
        Logger logger = new ConsoleLogger();

        OrderService orderService = new OrderService(orderProcessor, notificationService, logger);
        orderService.proccessOrder();
        orderService.addLog("Physical order processed");
        orderService.sendNotify("Your order has been placed!");

    }


}

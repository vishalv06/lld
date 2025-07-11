package solid.srp.order;

public class SMSManager {

    public void sendSms(Order order) {
        System.out.println("Sending SMS to customer for order Id..." + order.getProductId());
    }
}

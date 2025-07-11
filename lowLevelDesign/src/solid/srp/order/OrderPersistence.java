package solid.srp.order;

public class OrderPersistence {

    public void saveOrderToDatabase(Order order) {
        System.out.println("Saving order with product ID: " + order.getProductId() + " to database");
    }
}

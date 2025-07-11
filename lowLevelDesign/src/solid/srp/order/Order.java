package solid.srp.order;

public class Order {

    private String productId;

    public Order(String productId) {
        this.productId = productId;
    }

    public String getProductId() {
        return productId;
    }
}
package solid.srp.invoice;

public class Invoice {

    private String item;
    private int quantity;
    private double pricePerItem;

    public Invoice(String item, int quantity, int pricePerItem) {
        this.item = item;
        this.quantity = quantity;
        this.pricePerItem = pricePerItem;
    }

    public String getItem() {
        return item;
    }

    public int getQuanity() {
        return quantity;
    }


    public double calculateTotal() {
        return quantity * pricePerItem;
    }

//    public void saveToFile() {
//        System.out.println("Saving invoice to file: " + item + ", Quantity: " + quantity + ", Total: " + calculateTotal());
//    }

    public void printInvoice() {
        System.out.println("Printing invoice for " + item);
    }
}

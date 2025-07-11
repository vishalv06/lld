package solid.srp.invoice;

public class FilePersistence {

    public void saveToFile(Invoice invoice) {
        System.out.println("Saving invoice to file: " + invoice.getItem() + ", Quantity: " + invoice.getQuanity() + ", Total: " + invoice.calculateTotal());
    }
}

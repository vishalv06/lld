package solid.srp.invoice;

public class InvoicePrinter {

    public void printInvoice(Invoice invoice) {
        System.out.println("Printing invoice for " + invoice.getItem() + "for quantity " + invoice.getQuanity() + " and amount " + invoice.calculateTotal());
    }
}

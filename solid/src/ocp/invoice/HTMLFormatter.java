package ocp.invoice;

public class HTMLFormatter implements InvoiceFormatter {

    @Override
    public void printInvoice() {
        System.out.println("Printing invoice as HTML");
    }

}

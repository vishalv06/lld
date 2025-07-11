package solid.ocp.invoice;

public class CSVFormatter implements InvoiceFormatter {

    @Override
    public void printInvoice() {
        System.out.println("Printing invoice as CSV");
    }
}

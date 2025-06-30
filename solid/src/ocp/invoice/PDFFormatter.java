package ocp.invoice;

public class PDFFormatter implements InvoiceFormatter{

    @Override
    public void printInvoice() {
        System.out.println("Printing invoice as PDF");
    }
}

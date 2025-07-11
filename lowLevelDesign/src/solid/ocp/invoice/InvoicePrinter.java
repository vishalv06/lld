package solid.ocp.invoice;

public class InvoicePrinter {

    private InvoiceFormatter invoiceFormatter;

    public InvoicePrinter(InvoiceFormatter invoiceFormatter) {
        this.invoiceFormatter = invoiceFormatter;
    }

    public void printInvoice() {
        invoiceFormatter.printInvoice();
    }

//    public void printInvoice(String format) {
//        if (format.equals("PDF")) {
//            System.out.println("Printing as PDF");
//        } else if (format.equals("CSV")) {
//            System.out.println("Printing as CSV");
//        } else if(format.equals("HTML")) {
//            System.out.println("Printing as HTML");
//        }
//    }

}

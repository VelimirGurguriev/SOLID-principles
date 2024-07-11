package Invoices;

public class PrintInvoice extends Invoice {
    Invoice invoice;

    public PrintInvoice(Invoice invoice) {
        this.invoice = invoice;
    }

    public void printToConsole() {
        System.out.printf("Invoice from company: %s, to customer: %s, total cost: %.2f, issued: %s",
                invoice.getCompanyName(), invoice.getCustomerName(), invoice.getAmount(), invoice.getDate());
        System.out.println();
    }

    public void printWithPrinter() {
        System.out.println("Invoice send to printer queue");
    }
}

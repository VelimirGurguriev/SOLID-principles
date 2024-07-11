package Invoices;

public class PrintInvoice extends Invoice {
    Invoice invoice;

    public PrintInvoice(Invoice invoice) {
        this.invoice = invoice;
    }

    public void printToConsole() {
        System.out.println("Invoice from company: " + getCompanyName() + " to customer: " + getCompanyName() +
                " total cost: " + getAmount() + " issued: " + getDate());
    }

    public void printWithPrinter() {
        System.out.println("Invoice send to printer queue");
    }
}

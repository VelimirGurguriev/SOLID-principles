package Invoices;

public class Main {
    public static void main(String[] args) {
        Invoice invoice = new Invoice(350.00, "George",
                "Car Repairs LTD", "20/03/2022");

        // testing the saving class
        SaveInvoice save = new SaveInvoice(invoice);
        save.saveToFile();

        // testing the printer class
        PrintInvoice invoicePrinter = new PrintInvoice(invoice);
        invoicePrinter.printToConsole();
        invoicePrinter.printWithPrinter();
    }
}

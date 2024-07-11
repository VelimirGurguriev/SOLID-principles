package Invoices;

import BookSave.Book;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SaveInvoice {
    private Invoice invoice;

    public SaveInvoice(Invoice invoice) {
        this.invoice = invoice;
    }

    public void saveToFile() {
        String fileName = "src\\Invoices\\invoiceDB.txt";
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
            oos.writeObject(this.invoice);
            System.out.println("Invoice saved successfully to database.");
        } catch (IOException exc) {
            System.out.println("Error during saving: " + exc);
        }
    }
}

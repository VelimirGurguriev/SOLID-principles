package Invoices;

import java.io.Serializable;

public class Invoice implements Serializable {
    private double amount;
    private String customerName;
    private String companyName;
    private String date;

    public Invoice() { }

    public Invoice(double amount, String customerName, String companyName, String date) {
        this.amount = amount;
        this.customerName = customerName;
        this.companyName = companyName;
        this.date = date;
    }

    public double getAmount() {
        return amount;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public String getDate() {
        return date;
    }
}

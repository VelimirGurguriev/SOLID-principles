package BookSave;

import java.io.Serializable;

public class Book implements Serializable {
    private String title;
    private String author;
    private int pages;
    private double price;

    public Book(String title, String author, int pages, double price) {
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.price = price;
    }

    public String getBookSummary() {
        return title + " by " + author + ", has " + pages + " pages and costs: " + price + "BGN.";
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public int getPages() {
        return pages;
    }

}

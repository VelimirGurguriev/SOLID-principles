package BookSave;

public class Main {
    public static void main(String[] args) {
        Book book = new Book("Harry Potter", "J. K. Rowling", 600, 20.00);
        SaveToDB save = new SaveToDB();

        System.out.println(book.getBookSummary());

        save.saveToFile(book);
    }
}

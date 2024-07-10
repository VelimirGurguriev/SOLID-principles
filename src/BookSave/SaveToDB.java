package BookSave;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SaveToDB {

    public SaveToDB() {

    }

    public void saveToFile(Book book) {
        String fileName = "src\\BookSave\\database.txt";
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
            oos.writeObject(book);
            System.out.println("Book saved successfully to database.");
        } catch (IOException exc) {
            System.out.println("Error during saving: " + exc);
        }
    }
}

package Logging;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class FileLog implements Loggable {
    private String filename;

    public FileLog(String filename) {
        this.filename = filename;
    }

    @Override
    public void log(String message) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {
            oos.writeObject(message);
            System.out.println("Message successfully logged to file.");
        } catch (IOException exc) {
            System.out.println("Error during logging: " + exc);
        }
    }
}

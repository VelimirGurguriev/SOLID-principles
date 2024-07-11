package Logging;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Logger {

    public Logger() { }

    public void logToConsole(String message) {
        System.out.println(message);
    }

    public void logToFile(String message, String filename) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {
            oos.writeObject(message);
            System.out.println("Message successfully logged to file.");
        } catch (IOException exc) {
            System.out.println("Error during logging: " + exc);
        }
    }
}

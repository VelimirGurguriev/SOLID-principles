package Logging;

import java.io.IOException;

public class DatabaseLog implements Loggable {
    private Database database;

    public DatabaseLog(Database database) {
        this.database = database;
    }

    @Override
    public void log(String message) {
        try {
            database.saveLog(message);
        } catch (Exception exc) {
            System.out.println("Error during logging: " + exc);
        }
    }
}

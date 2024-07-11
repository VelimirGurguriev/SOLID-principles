package Logging;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Logger {
    private Loggable logType;

    public Logger(Loggable logType) {
        this.logType = logType;
    }

    public void log(String message) {
        logType.log(message);
    }

    public Loggable getLogType() {
        return logType;
    }

    public void setLogType(Loggable logType) {
        this.logType = logType;
    }

    public static void main(String[] args) {
        // test console logging
        Logger logger = new Logger(new ConsoleLog());
        logger.log("Test console log");
    }
}

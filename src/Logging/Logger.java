package Logging;

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

        // test file logging
        logger.setLogType(new FileLog("src\\Logging\\fileLogs.txt"));
        logger.log("Test file log");

        // test database logging
        Database database = new Database();
        logger.setLogType(new DatabaseLog(database));
        logger.log("Test database log");
    }
}

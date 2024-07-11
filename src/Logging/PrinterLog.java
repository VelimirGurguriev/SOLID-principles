package Logging;

public class PrinterLog implements Loggable {

    @Override
    public void log(String message) {
        System.out.println("Logged to printer: " + message);
    }
}

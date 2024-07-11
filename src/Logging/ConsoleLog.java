package Logging;

public class ConsoleLog implements Loggable {
    @Override
    public void log(String message) {
        System.out.println(message);
    }
}

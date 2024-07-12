package Penguins;

public class Emu extends Bird implements Runable {
    public Emu() {
    }

    @Override
    public void run() {
        System.out.println("started running");
    }
}

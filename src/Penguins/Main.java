package Penguins;

public class Main {
    public static void main(String[] args) {
        Penguin penguin = new Penguin();
        penguin.swim();
        System.out.println("------------");
        Emu emu = new Emu();
        emu.run();
        System.out.println("------------");
        Pigeon pigeon = new Pigeon();
        pigeon.fly();
        pigeon.land();
    }
}

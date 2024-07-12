package Penguins;

public class Pigeon extends Bird implements Flyable {

    public Pigeon() {
    }

    @Override
    public void fly() {
        System.out.println("started flying");
    }

    @Override
    public void land() {
        System.out.println("bird has landed");
    }
}

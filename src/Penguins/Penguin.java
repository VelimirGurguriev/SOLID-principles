package Penguins;

public class Penguin extends Bird implements Swimable {

    public Penguin() {
    }

    @Override
    public void swim() {
        System.out.println("started swimming");
    }
}

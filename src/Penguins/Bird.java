package Penguins;

public class Bird {
    private String name;
    private String colour;
    private int age;

    public Bird() {

    }

    public void eat() {
        System.out.println("started eating");
    }

    public void sleep() {
        System.out.println("started sleeping");
    }

    public void walk() {
        System.out.println("started walking");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

package org.example.models3;

public class Bird  extends  Animals{
    private int quantity;

    public Bird(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("Sound: Tweet");
    }

    @Override
    public void move() {
        System.out.println("Move: Fly");
    }

    @Override
    public void display() {
        System.out.println("Type Animal: Bird");
        super.display();
    }
}

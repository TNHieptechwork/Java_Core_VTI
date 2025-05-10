package org.example.models3;

public class Cat extends Animals{
    private int quantity;

    public Cat(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("Sound: Meow");
    }

    @Override
    public void move() {
        System.out.printf("Move: Run & walk & Jump & Parkout");
    }

    @Override
    public void display() {
        System.out.println("Type Animal: Cat");
        super.display();
    }
}

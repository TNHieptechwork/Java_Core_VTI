package org.example.models3;

public class Dog extends Animals {

    public Dog(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("Sound: Wow");
    }

    @Override
    public void move() {
        System.out.println("Move: Walk & Run");
    }

    @Override
    public void display() {
        System.out.println("Type Animal: Dog");
        super.display();
    }
}

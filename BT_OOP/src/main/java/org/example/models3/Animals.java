package org.example.models3;

public abstract class Animals {
    private String name;
    public abstract void makeSound();
    public abstract void move();

    public Animals(String name) {
        this.name = name;
    }

    public void display(){
        System.out.println("Name: " + this.name);
    }
}

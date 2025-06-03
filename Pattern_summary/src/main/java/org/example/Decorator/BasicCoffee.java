package org.example.Decorator;

public class BasicCoffee implements Coffee{

    @Override
    public double getCost() {
        return 20000;
    }

    @Override
    public String getDescription() {
        return "Coffee";
    }
}

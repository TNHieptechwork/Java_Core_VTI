package org.example.Decorator_Pattern.BT1;

public class BaseCoffee implements Coffee{

    @Override
    public double cost() {
        return 20000;
    }

    @Override
    public String getDescription() {
        return "Cafe";
    }
}

package org.example.Decorator_Pattern.BT1;

public class CoffeeDecorator implements Coffee {
    protected Coffee coffee;

    public CoffeeDecorator(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public double cost() {
        return coffee.cost();
    }

    @Override
    public String getDescription() {
        return coffee.getDescription();
    }
}

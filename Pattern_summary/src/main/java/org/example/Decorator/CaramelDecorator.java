package org.example.Decorator;

public class CaramelDecorator extends CoffeeDecorator{
    public CaramelDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public double getCost() {
        return super.getCost() + 7_000;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Caramel";
    }
}

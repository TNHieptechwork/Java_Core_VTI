package org.example.Decorator_Pattern.BT1;

public class MilkDecorator extends CoffeeDecorator{

    public MilkDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public double cost() {
        return super.cost() + 5000;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " bonus milk \n";
    }
}

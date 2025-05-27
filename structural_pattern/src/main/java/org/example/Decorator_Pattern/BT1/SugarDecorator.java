package org.example.Decorator_Pattern.BT1;

public class SugarDecorator extends CoffeeDecorator{

    public SugarDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public double cost() {
        return super.cost() + 3000;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " bonus sugar \n";
    }
}

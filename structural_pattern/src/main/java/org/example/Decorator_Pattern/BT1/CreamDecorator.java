package org.example.Decorator_Pattern.BT1;

public class CreamDecorator extends CoffeeDecorator{

    public CreamDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public double cost() {
        return super.cost() + 7000;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " bonus cream \n";
    }
}

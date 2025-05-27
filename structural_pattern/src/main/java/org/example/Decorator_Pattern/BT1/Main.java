package org.example.Decorator_Pattern.BT1;

public class Main {
    public static void main(String[] args) {
        Coffee coffee = new BaseCoffee();
        coffee = new SugarDecorator(coffee);
        coffee = new MilkDecorator(coffee);
        coffee = new CreamDecorator(coffee);

        System.out.println("Description: " + coffee.getDescription());
        System.out.println("Total: " + coffee.cost() + "đ");
    }
}

package org.example.Decorator;

public class main {
    public static void main(String[] args) {
        Coffee coffee1 = new MilkDecorator(new BasicCoffee());
        System.out.println(coffee1.getDescription() + " | Giá: " + coffee1.getCost() + " VND");

        // Cà phê có đường + caramel
        Coffee coffee2 = new CaramelDecorator(new SugarDecorator(new BasicCoffee()));
        System.out.println(coffee2.getDescription() + " | Giá: " + coffee2.getCost() + " VND");

        // Cà phê full topping
        Coffee coffee3 = new CaramelDecorator(new MilkDecorator(new SugarDecorator(new BasicCoffee())));
        System.out.println(coffee3.getDescription() + " | Giá: " + coffee3.getCost() + " VND");
    }
}

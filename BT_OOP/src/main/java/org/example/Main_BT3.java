package org.example;

import org.example.models3.*;

import java.util.ArrayList;
import java.util.List;

public class Main_BT3 {
    public static void main(String[] args) {
        List<Animals> animals = new ArrayList<>();
        Zoo z = new Zoo(animals);

        z.addAnimal(new Dog("Red"));
        z.addAnimal(new Dog("Peanut"));
        z.addAnimal(new Cat("Luna"));
        z.addAnimal(new Cat("Lock Down"));
        z.addAnimal(new Bird("Optimus Prime"));
        z.addAnimal(new Bird("Sound Wave"));
        z.addAnimal(new Bird("Start Dream"));

        z.displayInf();
        System.out.printf("\n-------------------\n");
        z.numberOfAnimals();
    }
}

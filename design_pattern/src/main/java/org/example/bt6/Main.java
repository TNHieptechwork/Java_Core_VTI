package org.example.bt6;

public class Main {
    public static void main(String[] args) {
        RegistryFactory.register("Vehicle",Car::new);
        RegistryFactory.register("Electronic",Phone::new);

        Product p1 = RegistryFactory.create("Vehicle");
        p1.use();
        Product p2 = RegistryFactory.create("Electronic");
        p2.use();

    }
}

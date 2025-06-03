package org.example.Factory;

public class main {
    public static void main(String[] args) {
        VehicleFactory vehicleFactory = new VehicleFactory();

        Vehicle vehicle = vehicleFactory.createVehicle("car");
        vehicle.drive();
        Vehicle vehicle1 = vehicleFactory.createVehicle("truck");
        vehicle1.drive();

        Vehicle vehicle2  = vehicleFactory.createVehicle("bike");
        vehicle2.drive();
    }
}

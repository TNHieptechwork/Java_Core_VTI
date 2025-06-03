package org.example.Factory;

public class VehicleFactory {
    public Vehicle createVehicle(String type){
        if(type.equalsIgnoreCase("car")){
            return new Car();
        }
        else if(type.equalsIgnoreCase("bike")){
            return new Bike();
        } else if (type.equalsIgnoreCase("truck")) {
            return new Truck();
        }
        else{
            return null;
        }
    }
}

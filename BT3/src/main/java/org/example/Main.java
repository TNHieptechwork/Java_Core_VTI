package org.example;

import org.example.models.Flight;
import org.example.models.FlightManager;
import org.example.models.Passenger;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        FlightManager manager = new FlightManager();

        Passenger p1 = new Passenger("P01", "Nguyễn Văn A");
        Passenger p2 = new Passenger("P02", "Trần Thị B");
        Passenger p3 = new Passenger("P03", "Lê Văn C");

        manager.addPassenger(p1);
        manager.addPassenger(p2);
        manager.addPassenger(p3);

        Flight f1 = new Flight("F01", "Hà Nội", "TP.HCM", LocalDateTime.now().plusHours(2), 2);
        Flight f2 = new Flight("F02", "Hà Nội", "Đà Nẵng", LocalDateTime.now().plusDays(1), 1);
        Flight f3 = new Flight("F03", "Hà Nội", "TP.HCM", LocalDateTime.now().plusDays(2), 3);
        Flight f4 = new Flight("F04", "TP.HCM", "Hà Nội", LocalDateTime.now().plusDays(3), 2);
        manager.addFlight(f1);
        manager.addFlight(f2);
        manager.addFlight(f3);
        manager.addFlight(f4);

        // Đặt vé
        manager.Booking("P01", "F01");
        manager.Booking("P02", "F01"); // Full
        manager.Booking("P03", "F01"); // Thất bại

        manager.Booking("P01", "F03"); // OK
        manager.Booking("P01", "F03"); // Thất bại: trùng

        manager.Booking("P02", "F03"); // OK
        manager.Booking("P03", "F03"); // OK


        // In danh sách chuyến bay của hành khách
        manager.printListFlightOfPassenger("P01");
        manager.printListFlightOfPassenger("P02");
        manager.printListFlightOfPassenger("P03");

        // In danh sách hành khách của chuyến bay
        manager.printPassengerOfFlight("F01");
        manager.printPassengerOfFlight("F03");

        // Tìm chuyến bay được đặt nhiều nhất
        manager.findFlightMaxBooking();

        manager.findPassengerFlightMax();

        // In các chuyến từ Hà Nội đến TP.HCM trong 3 ngày tới
        manager.printFlightHN_HCM_3day();
    }

}
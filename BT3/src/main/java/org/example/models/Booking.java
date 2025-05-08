package org.example.models;

import java.time.LocalDateTime;

public class Booking {
    private Passenger passenger;
    private Flight flight;
    private LocalDateTime bookingTime;

    public Booking(Passenger passenger, Flight flight, LocalDateTime bookingTime) {
        this.passenger = passenger;
        this.flight = flight;
        this.bookingTime = bookingTime;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    public LocalDateTime getBookingTime() {
        return bookingTime;
    }

    public void setBookingTime(LocalDateTime bookingTime) {
        this.bookingTime = bookingTime;
    }
}

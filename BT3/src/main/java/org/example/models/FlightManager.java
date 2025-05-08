package org.example.models;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;

public class FlightManager {
    private Map<String,Flight> flightMap = new HashMap<>();
    private Map<String,Passenger> passengerMap = new HashMap<>();
    private List<Booking> bookingList = new ArrayList<>();

    public void addFlight(Flight flight){
        flightMap.put(flight.getFlightId(),flight);
        System.out.println("Added Flight \n");
    }
    public void addPassenger(Passenger passenger){
        passengerMap.put(passenger.getId(),passenger);
        System.out.println("Added Passenger \n");
    }

    public void Booking(String passengerId,String flightId){
        Passenger p = passengerMap.get(passengerId);
        Flight f = flightMap.get(flightId);
        if(p == null ||f == null){
            System.out.printf("Not found passenger || flight \n");
            return;
        }

        for(Booking b : bookingList){
            if(b.getPassenger().getId().equals(passengerId) && b.getFlight().getFlightId().equals(flightId)){
                System.out.printf("Passenger was booked that flight \n");
                return;
            }
        }
        int countCurrent = 0;
        for(Booking b : bookingList){
            if(b.getFlight().getFlightId().equals(flightId))
                countCurrent++;
        }
        if(countCurrent >= f.getCapacity()){
            System.out.println("The Flight is Full \n");
            return;
        }
        Booking bk = new Booking(p,f, LocalDateTime.now());
        bookingList.add(bk);
        System.out.println("Succesfully booked for passenger " + p.getName() +"\n");
    }

    public void printListFlightOfPassenger(String passId){
        Passenger passenger = passengerMap.get(passId);
        if(passenger == null){
            System.out.println("Not found passenger \n");
            return;
        }
        boolean flag = false;
        System.out.printf("List of Flight's Passenger: \n" + passenger.getName());
        for(Booking b : bookingList){
            if(b.getPassenger().getId().equals(passId)){
                Flight f = b.getFlight();
                System.out.println("Flight_ID: " + f.getFlightId() + " - Origin: " + f.getOrigin()
                + "- destination:  " + f.getDestination() + " - departureTime: " + f.getDepartureTime() +
                        " - capacity: " + f.getCapacity() + "\n");
                flag = true;
            }
        }
        if(!flag){
            System.out.println("This passenger hasn't booked \n");
        }
    }
    public void printPassengerOfFlight(String flightID){
        Flight f = flightMap.get(flightID);
        if(f == null){
            System.out.println("Not found flight \n");
        }
        boolean flag = false;
        System.out.println("List of Passenger's flight: " +flightID+ " \n");
        for(Booking b : bookingList){
            if(b.getFlight().getFlightId().equals(flightID)){
                Passenger p  = b.getPassenger();
                System.out.println("Id_Passenger: " + p.getId() + " - Name: " + p.getName() +"\n");
                flag = true;
            }
        }
        if(!flag){
            System.out.println("\nThis flight not have passenger \n");
        }
    }
    public void findFlightMaxBooking(){

        if(bookingList.isEmpty()){
            System.out.println("Not found flight \n");
        }
        Map<String,Integer> flightCountMap = new HashMap<>();
        for(Booking b : bookingList){
            String flightId = b.getFlight().getFlightId();
            if(flightCountMap.containsKey(flightId)){
                int countFlight = flightCountMap.get(flightId);
                countFlight++;
                flightCountMap.put(flightId,countFlight);
            }
            else{
                flightCountMap.put(flightId,1);
            }
        }

        String keyMaxBooking = null;
        int valueMaxBooking = 0;
        for(Map.Entry<String,Integer> e : flightCountMap.entrySet()){
            if(e.getValue() > valueMaxBooking){
                keyMaxBooking = e.getKey();
                valueMaxBooking = e.getValue();
            }
        }

        if(keyMaxBooking != null){
            Flight maxBookedFlight = flightMap.get(keyMaxBooking);
            System.out.println("Flight have max book \n");
            System.out.println("Flight_ID: " + maxBookedFlight.getFlightId() + " | Origin: " + maxBookedFlight.getOrigin() +
                    " | Destination: " + maxBookedFlight.getDestination() + " | booking count " + valueMaxBooking +"\n");
        } else {
            System.out.println("❌ Không tìm thấy chuyến bay nào có lượt đặt.\n");
        }
    }

    public void findPassengerFlightMax(){

        if(bookingList.isEmpty()){
            System.out.println("Not found passenger \n");
        }
        Map<String,Integer> passCountMap = new HashMap<>();
        for(Booking b : bookingList){
            String passId = b.getPassenger().getId();
            if(passCountMap.containsKey(passId)){
                int countPass = passCountMap.get(passId);
                countPass++;
                passCountMap.put(passId,countPass);
            }
            else{
                passCountMap.put(passId,1);
            }
        }

        String keyMaxPassId = null;
        int valueMaxPassId = 0;
        for(Map.Entry<String,Integer> e : passCountMap.entrySet()){
            if(e.getValue() > valueMaxPassId){
                keyMaxPassId = e.getKey();
                valueMaxPassId = e.getValue();
            }
        }

        if(keyMaxPassId != null){
            Passenger maxPass = passengerMap.get(keyMaxPassId);
            System.out.println("Passenger flight max \n");
            System.out.println("ID: " + maxPass.getId() + " | Name: " + maxPass.getName() + " | flight count: " + valueMaxPassId + "\n");
        }
        else {
            System.out.println("Not found passenger.\n");
        }
    }

    public void printFlightHN_HCM_3day(){
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime threeDaysLater = now.plusDays(3);

        List<Flight> selectedFlights = new ArrayList<>();

        for (Flight f : flightMap.values()) {
            if (f.getOrigin().equalsIgnoreCase("Hà Nội") &&
                    f.getDestination().equalsIgnoreCase("TP.HCM") &&
                    (f.getDepartureTime().isAfter(now) || f.getDepartureTime().isEqual(now)) &&
                    f.getDepartureTime().isBefore(threeDaysLater)) {
                selectedFlights.add(f);
            }
        }

        for (int i = 0; i < selectedFlights.size() - 1; i++) {
            for (int j = i + 1; j < selectedFlights.size(); j++) {
                if (selectedFlights.get(i).getDepartureTime().isAfter(selectedFlights.get(j).getDepartureTime())) {
                    Flight temp = selectedFlights.get(i);
                    selectedFlights.set(i, selectedFlights.get(j));
                    selectedFlights.set(j, temp);
                }
            }
        }

        if (selectedFlights.isEmpty()) {
            System.out.println("Not found flight \n");
            return;
        }

        System.out.println("✅ List of Flight from Ha Noi to TP.HCM in 3 days: \n");
        for (Flight f : selectedFlights) {
            System.out.println("Flight_ID: " + f.getFlightId() +
                    " | Departure: " + f.getDepartureTime() +
                    " | Origin: " + f.getOrigin() +
                    " | Destination: " + f.getDestination());
        }
    }

}

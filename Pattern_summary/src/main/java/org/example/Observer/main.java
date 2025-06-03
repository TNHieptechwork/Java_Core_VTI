package org.example.Observer;

public class main {
    public static void main(String[] args) {
        NewsAgency agency = new NewsAgency();

        Subscriber us1 = new Subscriber("Messi");
        Subscriber us2 = new Subscriber("Jack");
        Subscriber us3 = new Subscriber("J97");

        agency.registerObserver(us1);
        agency.registerObserver(us2);

        agency.addNews("C- math");
        agency.registerObserver(us3);

        agency.removeObserver(us1);

    }
}

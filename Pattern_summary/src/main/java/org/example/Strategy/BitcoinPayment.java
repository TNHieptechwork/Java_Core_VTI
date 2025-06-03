package org.example.Strategy;

public class BitcoinPayment implements PaymentStrategy{

    @Override
    public void pay(double amount) {
        System.out.println("pay " + amount + " with bitcoin");
    }
}

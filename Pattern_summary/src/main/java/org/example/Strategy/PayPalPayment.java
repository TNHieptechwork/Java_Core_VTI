package org.example.Strategy;

public class PayPalPayment implements  PaymentStrategy{
    private String email;

    public PayPalPayment(String email) {
        this.email = email;
    }

    @Override
    public void pay(double amount) {
        System.out.println("pay " + amount + " with paypal . Email" + email);
    }
}

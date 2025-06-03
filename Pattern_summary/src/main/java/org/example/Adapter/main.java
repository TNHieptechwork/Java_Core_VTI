package org.example.Adapter;

public class main {
    public static void main(String[] args) {
        OldPaymentSystem oldPaymentSystem = new OldPaymentSystem();

        PaymentProcessor paymentProcessor = new PaymentAdapter(oldPaymentSystem);

        paymentProcessor.processPayment(5000);

    }
}

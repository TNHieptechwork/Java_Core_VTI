package org.example.Stuctural_Pattern.BT2;

public class PaymentClient {
    private PaymentGateway paymentGateway;

    public PaymentClient(PaymentGateway paymentGateway) {
        this.paymentGateway = paymentGateway;
    }
    public void processPayment(double amount){
        paymentGateway.pay(amount);
    }
}

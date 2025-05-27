package org.example.Stuctural_Pattern.BT2;

public class PaypalAdapter implements PaymentGateway{
    private PaypalAPI paypalAPI;

    public PaypalAdapter(PaypalAPI paypalAPI) {
        this.paypalAPI = paypalAPI;
    }

    @Override
    public void pay(double amount) {
        paypalAPI.senPayment(amount);
    }
}

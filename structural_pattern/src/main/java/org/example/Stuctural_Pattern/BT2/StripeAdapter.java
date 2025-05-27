package org.example.Stuctural_Pattern.BT2;

public class StripeAdapter implements PaymentGateway{
    private StripeAPI stripeAPI;

    public StripeAdapter(StripeAPI stripeAPI) {
        this.stripeAPI = stripeAPI;
    }

    @Override
    public void pay(double amount) {
        stripeAPI.makePayment(amount);
    }
}

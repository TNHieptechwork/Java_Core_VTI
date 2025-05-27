package org.example.Stuctural_Pattern.BT2;

public class Main {
    public static void main(String[] args) {
        PaymentGateway paymentGateway = new PaypalAdapter(new PaypalAPI());
        PaymentClient client = new PaymentClient(paymentGateway);
        client.processPayment(100000);

        PaymentGateway paymentGateway1 = new StripeAdapter(new StripeAPI());
        PaymentClient client1 = new PaymentClient(paymentGateway);
        client1.processPayment(55000);

        PaymentGateway paymentGateway2 = new CryptoAdapter(new CryptoAPI(),"BTC-Wallet");
        PaymentClient client2 = new PaymentClient(paymentGateway);
        client2.processPayment(5125125);

    }
}

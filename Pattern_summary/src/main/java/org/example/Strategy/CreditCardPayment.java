package org.example.Strategy;

public class CreditCardPayment implements PaymentStrategy{
    private String cardNumber;
    private String cardHolder;

    public CreditCardPayment(String cardNumber, String cardHolder) {
        this.cardNumber = cardNumber;
        this.cardHolder = cardHolder;
    }

    @Override
    public void pay(double amount) {
        System.out.println("pay " + amount + " with credit.Card holder" + cardHolder);
    }

}

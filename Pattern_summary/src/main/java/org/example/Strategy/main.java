package org.example.Strategy;

public class main {
    public static void main(String[] args) {
        ShoppingCart shoppingCart = new ShoppingCart();

        shoppingCart.setPaymentStrategy(new CreditCardPayment("22124125","john"));
        shoppingCart.checkout(25000);

        shoppingCart.setPaymentStrategy(new PayPalPayment("jack@gmail.com"));
        shoppingCart.checkout(100500);

        shoppingCart.setPaymentStrategy(new BitcoinPayment());
        shoppingCart.checkout(1251515);
    }
}

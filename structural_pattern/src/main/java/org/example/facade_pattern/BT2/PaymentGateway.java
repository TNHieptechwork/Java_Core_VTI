package org.example.facade_pattern.BT2;

public class PaymentGateway {
    public boolean processPayment(String customer, double amount) {
        System.out.println("Xử lý thanh toán cho " + customer + " số tiền: " + String.format("%,.0f₫", amount));
        return true;
    }
}

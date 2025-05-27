package org.example.facade_pattern.BT2;

public class Notification {
    public void sendConfirmation(String customer) {
        System.out.println("Gửi email xác nhận cho khách hàng: " + customer);
    }
}

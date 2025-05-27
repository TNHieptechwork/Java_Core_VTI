package org.example.facade_pattern.BT2;

public class main {
    public static void main(String[] args) {
        OrderService orderService = new OrderService();

        orderService.placeOrder(
                "Điện thoại Samsung",
                2,
                7500000,
                "Nguyễn Văn A",
                "123 Đường Lê Lợi, Quận 1, TP.HCM"
        );
    }
}

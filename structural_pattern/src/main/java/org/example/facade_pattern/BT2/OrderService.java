package org.example.facade_pattern.BT2;

public class OrderService {
    private Inventory inventory;
    private PaymentGateway payment;
    private Shipping shipping;
    private Notification notification;

    public OrderService() {
        this.inventory = new Inventory();
        this.payment = new PaymentGateway();
        this.shipping = new Shipping();
        this.notification = new Notification();
    }

    public void placeOrder(String product, int quantity, double price, String customer, String address) {
        System.out.println("== ĐẶT HÀNG ==");

        if (!inventory.checkStock(product, quantity)) {
            System.out.println("Không đủ hàng!");
            return;
        }

        if (!payment.processPayment(customer, price * quantity)) {
            System.out.println("Thanh toán thất bại!");
            return;
        }

        inventory.reserve(product, quantity);
        shipping.ship(product, quantity, address);
        notification.sendConfirmation(customer);

        System.out.println("Đặt hàng thành công!");
    }
}

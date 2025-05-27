package org.example.facade_pattern.BT2;

public class Shipping {
    public void ship(String product, int quantity, String address) {
        System.out.println("Giao " + quantity + " sản phẩm " + product + " đến " + address);
    }
}

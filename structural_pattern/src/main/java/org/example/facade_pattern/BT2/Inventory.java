package org.example.facade_pattern.BT2;

public class Inventory {
    public boolean checkStock(String product, int quantity) {
        System.out.println("Kiểm tra tồn kho cho " + product);
        return true;
    }

    public void reserve(String product, int quantity) {
        System.out.println("Đã giữ " + quantity + " sản phẩm " + product);
    }
}

package org.example.flyweight_Pattern.BT2;

public class Main {
    public static void main(String[] args) {
        FontStyle font1 = FontFactory.getFont("Arial", 12, "Đen");
        FontStyle font2 = FontFactory.getFont("Times New Roman", 14, "Xanh");

        font1.render(10, 20, 'H');
        font1.render(20, 20, 'e');
        font1.render(30, 20, 'l');
        font1.render(40, 20, 'l');
        font1.render(50, 20, 'o');

        font2.render(10, 40, 'W');
        font2.render(20, 40, 'o');
        font2.render(30, 40, 'r');
        font2.render(40, 40, 'l');
        font2.render(50, 40, 'd');

        System.out.println("Số kiểu font đã tạo: " + FontFactory.getFontCount());
    }
}

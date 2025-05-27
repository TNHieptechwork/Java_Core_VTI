package org.example.facade_pattern.BT1;

public class Projector {
    public void on() {
        System.out.println("Máy chiếu bật");
    }

    public void setWideScreenMode() {
        System.out.println("Đang chờ DVD");
    }

    public void off() {
        System.out.println("Máy chiếu tắt");
    }
}

package org.example.facade_pattern.BT1;

public class DVDPlayer {
    public void on() {
        System.out.println("DVD Player bật");
    }

    public void play(String movie) {
        System.out.println("Đang phát phim: " + movie);
    }

    public void off() {
        System.out.println("DVD Player tắt");
    }
}

package org.example.facade_pattern.BT1;

public class SoundSystem {
    public void on() {
        System.out.println("Âm thanh bật");
    }

    public void setVolume(int level) {
        System.out.println("Âm lượng được đặt ở mức: " + level);
    }

    public void off() {
        System.out.println("Âm thanh tắt");
    }
}

package org.example.Bridge_Pattern.BT1;

public class SamSUng implements TV{
    @Override
    public void on() {
        System.out.println("samsung turn on");
    }

    @Override
    public void off() {
        System.out.println("Samsung turn off");
    }

    @Override
    public void setChannel(int channel) {
        System.out.println("Samsung's current channel: " + channel);
    }
}

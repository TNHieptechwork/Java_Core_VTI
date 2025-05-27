package org.example.Bridge_Pattern.BT1;

public class Sony implements TV{

    @Override
    public void on() {
        System.out.println("sony turn on");
    }

    @Override
    public void off() {
        System.out.println("sony turn off");
    }

    @Override
    public void setChannel(int channel) {
        System.out.println("sony's current channel: " + channel);
    }
}

package org.example.Bridge_Pattern.BT2;

public class Mobile implements DeviceRender{

    @Override
    public void render(String content) {
        System.out.println("Display on mobile: " + content);
    }
}

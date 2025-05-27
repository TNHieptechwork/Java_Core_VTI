package org.example.Bridge_Pattern.BT2;

public class Desktop implements DeviceRender{
    @Override
    public void render(String content) {
        System.out.println("Display on Desktop: " + content);
    }
}

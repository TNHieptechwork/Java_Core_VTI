package org.example.HW1;

public class WallNut extends GameObject{
    public WallNut(double health, int x, int y) {
        super(health, x, y);
    }

    @Override
    public void update() {
        System.out.println("WallNut is blocking at (" + x + ", " + y + ")");
    }
}

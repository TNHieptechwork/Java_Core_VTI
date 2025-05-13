package org.example.HW1;

public class Sunflower extends GameObject{
    public Sunflower(double health, int x, int y) {
        super(health, x, y);
    }

    @Override
    public void update() {
        System.out.println("Sunflower is growing at (" + x + ", " + y + ")");
    }
}

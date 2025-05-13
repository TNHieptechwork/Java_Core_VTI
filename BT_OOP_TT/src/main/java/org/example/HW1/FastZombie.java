package org.example.HW1;

public class FastZombie extends Zombie implements Mover{
    public FastZombie(double health, int x, int y) {
        super(health, x, y);
    }

    @Override
    public void update() {
        x-=2;
        System.out.println("FastZombie moved to (" + x + ", " + y + ")");
    }
}

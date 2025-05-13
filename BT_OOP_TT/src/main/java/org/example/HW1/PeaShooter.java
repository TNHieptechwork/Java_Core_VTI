package org.example.HW1;

public class PeaShooter extends GameObject implements Shooter{

    public PeaShooter(double health,int x, int y) {
        super(health, x, y);
    }

    @Override
    public void shoot(Zombie target) {
        System.out.println("Shooting Zombie!");
        target.takeDamge(20);
    }

    @Override
    public void update() {
        System.out.println("PeaShooter at (" + x + ", " + y + ") is ready.");
    }
}

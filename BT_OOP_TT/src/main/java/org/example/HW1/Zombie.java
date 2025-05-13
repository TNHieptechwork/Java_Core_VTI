package org.example.HW1;

public class Zombie extends GameObject implements Mover{

    public Zombie(double health, int x, int y) {
        super(health, x, y);
    }

    @Override
    public void update() {
        if(isAlive()){
            move();
        }
        else{
            System.out.println("Zombie down");
        }
    }

    @Override
    public void move() {
        x--;
        System.out.println("Zombie move to (" + x + ")" + "(" + y + ")");
    }
}

package org.example.HW1;

public abstract class GameObject {
    protected double health;
    protected int x;
    protected int y;

    public GameObject(double health, int x, int y) {
        this.health = health;
        this.x = x;
        this.y = y;
    }

    public  abstract  void update();
    public  void takeDamge(int amount){
        health -= amount;
        System.out.println(this.getClass().getSimpleName() + " take " + amount + " damge .Current Health: " + this.health);
    }
    public  boolean isAlive(){
        return health > 0;
    }
}

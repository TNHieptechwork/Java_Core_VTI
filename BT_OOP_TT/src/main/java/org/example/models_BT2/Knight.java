package org.example.models_BT2;

public class Knight implements Fighter{
    private String name;
    private int energy;

    public Knight(String name, int energy) {
        this.name = name;
        this.energy = energy;
    }

    @Override
    public String getNameFighter() {
        return name;
    }



    @Override
    public boolean isAlive() {
        return energy > 0;
    }

    @Override
    public void attack() {
        if(energy >= 10){
            System.out.println("Knight " + name + "attack by blade");
            energy -= 10;
        }
        else{
            System.out.println("not enough energy to attack");
        }
    }
}

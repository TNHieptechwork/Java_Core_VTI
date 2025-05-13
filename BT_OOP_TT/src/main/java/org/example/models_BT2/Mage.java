package org.example.models_BT2;

public class Mage implements Fighter{
    private String name;
    private int energy;

    public Mage(String name, int energy) {
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
        if(energy >= 12){
            energy -= 12;
            System.out.println("Archer " + name + "attack by bow");
        }
        else{
            System.out.println("not enough energy to attack");
            return;
        }
    }
}

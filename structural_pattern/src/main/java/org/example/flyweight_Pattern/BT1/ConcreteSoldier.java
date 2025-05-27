package org.example.flyweight_Pattern.BT1;

public class ConcreteSoldier implements Soldier{
    private String weapon;
    private String uniform;

    public ConcreteSoldier(String weapon, String uniform) {
        this.weapon = weapon;
        this.uniform = uniform;
    }

    @Override
    public void render(int x, int y) {
        System.out.println("position at : "+ x + " - " + y + "weapon: " + weapon + " uniform: " + uniform);
    }
}

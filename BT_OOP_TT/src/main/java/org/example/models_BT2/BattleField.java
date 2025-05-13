package org.example.models_BT2;

import java.util.*;

public class BattleField {
    List<Fighter> fighterList = new ArrayList<>();

    public void addFighter(Fighter f) {
        fighterList.add(f);
    }

    public void startBattle(){
        System.out.println("FIGHTING \n");
        boolean alive = true;
        while (alive){
            alive = false;
            for (Fighter f : fighterList) {
                if (f.isAlive()) {
                    f.attack();
                    alive = true;
                } else {
                    System.out.println(f.getNameFighter() + " out of energy.");
                }
            }
            System.out.println("---");
            System.out.println("🎉 Fight End!");
        }
    }
}

package org.example;

import org.example.models_BT2.Archer;
import org.example.models_BT2.BattleField;
import org.example.models_BT2.Knight;
import org.example.models_BT2.Mage;

public class BT2 {
    public static void main(String[] args) {
        BattleField battlefield = new BattleField();

        battlefield.addFighter(new Knight("Arthur",30));
        battlefield.addFighter(new Archer("Robin", 16));
        battlefield.addFighter(new Mage("Merlin", 36));

        battlefield.startBattle();
    }
}

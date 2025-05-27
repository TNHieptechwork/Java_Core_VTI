package org.example.flyweight_Pattern.BT1;

public class main {
    public static void main(String[] args) {
        Soldier infantry1 = SoldierFactory.getSoldier("infantry");
        infantry1.render(10, 20);

        Soldier infantry2 = SoldierFactory.getSoldier("infantry");
        infantry2.render(12, 25);

        Soldier sniper1 = SoldierFactory.getSoldier("sniper");
        sniper1.render(50, 80);

        Soldier medic1 = SoldierFactory.getSoldier("medic");
        medic1.render(15, 22);

        System.out.println("Số loại lính được tạo: " + SoldierFactory.getTotalSoldierTypes());
    }
}

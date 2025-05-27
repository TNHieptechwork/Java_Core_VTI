package org.example.flyweight_Pattern.BT1;

import java.util.HashMap;
import java.util.Map;

public class SoldierFactory {
    private static Map<String, Soldier> soldierMap = new HashMap<>();
    public static int getTotalSoldierTypes() {
        return soldierMap.size();
    }
    public static Soldier getSoldier(String type) {
        Soldier soldier = soldierMap.get(type);

        if(soldier == null){
            switch (type) {
                case "infantry":
                    soldier = new ConcreteSoldier("Súng trường", "Đồng phục bộ binh");
                    break;
                case "sniper":
                    soldier = new ConcreteSoldier("Súng bắn tỉa", "Đồng phục ngụy trang");
                    break;
                case "medic":
                    soldier = new ConcreteSoldier("Túi cứu thương", "Đồng phục y tế");
                    break;
                default:
                    throw new IllegalArgumentException("Không hỗ trợ loại lính: " + type);
            }
            soldierMap.put(type,soldier);
        }
        return  soldier;
    }
}

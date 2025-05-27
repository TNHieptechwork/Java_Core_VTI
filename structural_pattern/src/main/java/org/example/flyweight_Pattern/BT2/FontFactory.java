package org.example.flyweight_Pattern.BT2;

import java.util.*;

public class FontFactory {
    private static final Map<String, FontStyle> fontMap = new HashMap<>();

    public static  FontStyle getFont(String font, int size, String color){
        String key = font + size + color;
        if (!fontMap.containsKey(key)) {
            fontMap.put(key, new FontStyle(font, size, color));
        }
        return fontMap.get(key);
    }
    public static int getFontCount() {
        return fontMap.size();
    }
}

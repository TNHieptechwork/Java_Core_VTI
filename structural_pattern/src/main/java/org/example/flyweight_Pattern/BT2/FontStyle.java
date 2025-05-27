package org.example.flyweight_Pattern.BT2;

public class FontStyle implements CharacterFlyweight{
    private String font;
    private int size;
    private String color;

    public FontStyle(String font, int size, String color) {
        this.font = font;
        this.size = size;
        this.color = color;
    }

    @Override
    public void render(int x, int y, char character) {
        System.out.println("Hiển thị '" + character + "' tại (" + x + ", " + y + ") với font: " + font + ", cỡ: " + size + ", màu: " + color);
    }
}

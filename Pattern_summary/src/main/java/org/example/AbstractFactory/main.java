package org.example.AbstractFactory;

public class main {
    public static void main(String[] args) {
        UIFactory fa;
        String theme = "dark";

        if(theme.equalsIgnoreCase("dark")){
            fa = new DarkThemeFactory();
        }
        else{
            fa = new LightThemeFactory();
        }
        App app = new App(fa);
        app.renderUI();
    }
}

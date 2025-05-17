package org.example.bt7;

import org.example.bt7.Mac.MacFactory;
import org.example.bt7.Window.WindowsFactory;

public class Main {
    public static void main(String[] args) {
        GUIFactory guiFactory;
        String os = System.getProperty("os.name").toLowerCase();
        //String os = "MacBook Air Pro";
        if(os.contains("window")){
            guiFactory = new WindowsFactory();
        }
        else{
            guiFactory = new MacFactory();
        }

        App app = new App(guiFactory);
        app.render();
    }
}

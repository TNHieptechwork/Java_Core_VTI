package org.example.Decorator;

public class BasicImage implements ImageData{
    String name;

    public BasicImage(String name) {
        this.name = name;
    }

    @Override
    public void save() {
        System.out.println("Saved Img original");
    }
}

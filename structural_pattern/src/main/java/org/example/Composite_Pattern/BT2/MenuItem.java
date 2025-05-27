package org.example.Composite_Pattern.BT2;

public class MenuItem implements IMenu{
   private String name;

    public MenuItem(String name) {
        this.name = name;
    }

    @Override
    public void showMenu(String indent) {
        System.out.println(indent + "- " + name);
    }
}

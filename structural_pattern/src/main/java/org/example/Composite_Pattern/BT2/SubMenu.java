package org.example.Composite_Pattern.BT2;

import java.util.ArrayList;
import java.util.List;

public class SubMenu implements IMenu {
    private String name;
    private List<IMenu> iMenuList = new ArrayList<>();

    public SubMenu(String name) {
        this.name = name;
    }

    public void addMenu(IMenu component) {
        iMenuList.add(component);
    }

    public void removeMenu(IMenu component) {
        iMenuList.remove(component);
    }

    @Override
    public void showMenu(String indent) {
        System.out.println("+  " + name + "\n");
        for (IMenu m : iMenuList){
           m.showMenu(indent + " ");
        }
    }
}

package org.example.Composite_Pattern.BT2;

public class Main {
    public static void main(String[] args) {
        IMenu component = new MenuItem("C++");
        IMenu component1 = new MenuItem("C#");
        IMenu component2= new MenuItem("C");

        SubMenu subMenu = new SubMenu("Programing Laguage");
        subMenu.addMenu(component);
        subMenu.addMenu(component1);
        subMenu.addMenu(component2);

        SubMenu subMenu1 = new SubMenu("Database");
        subMenu1.addMenu(new MenuItem("SQL"));
        subMenu1.addMenu(new MenuItem("T-SQL"));

        SubMenu subMenu2 = new SubMenu("OS");
        SubMenu subMenu3 = new SubMenu("Window");
        SubMenu subMenu4 = new SubMenu("Mac");

        subMenu3.addMenu(new MenuItem("Window 11"));
        subMenu3.addMenu(new MenuItem("Window xp"));
        subMenu3.addMenu(new MenuItem("Window 98"));

        subMenu2.addMenu(subMenu3);

        subMenu2.addMenu(subMenu4);

        SubMenu MainMenu = new SubMenu("ROOT");
        MainMenu.addMenu(subMenu);
        MainMenu.addMenu(subMenu1);
        MainMenu.addMenu(subMenu2);

        MainMenu.showMenu("");
    }
}

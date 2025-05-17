package org.example.bt7;

public class App {
    private Button btn;
    private Checkbox chk;
    private Menu menu;
    private Scrollbar scrollbar;

    public App(GUIFactory factory) {
        btn = factory.createButton();
        chk = factory.createCheckbox();
        menu =factory.createMenu();
        scrollbar = factory.createScrollbar();
    }
    public void render(){
        btn.click();
        chk.check();
        menu.display();
        scrollbar.scroll();
    }
}

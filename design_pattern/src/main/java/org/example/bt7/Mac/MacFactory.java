package org.example.bt7.Mac;

import org.example.bt7.*;
import org.example.bt7.Window.WindowMenu;

public class MacFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacCheckBox();
    }

    @Override
    public Menu createMenu() {
        return new MacMenu();
    }

    @Override
    public Scrollbar createScrollbar() {
        return new MacScrollbar();
    }
}

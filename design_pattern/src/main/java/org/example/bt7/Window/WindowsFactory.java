package org.example.bt7.Window;

import org.example.bt7.*;

public class WindowsFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new WindowButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowCheckbox();
    }

    @Override
    public Menu createMenu() {
        return new WindowMenu();
    }

    @Override
    public Scrollbar createScrollbar() {
        return new WindowScrollbar();
    }
}

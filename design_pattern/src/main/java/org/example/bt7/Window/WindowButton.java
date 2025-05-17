package org.example.bt7.Window;

import org.example.bt7.Button;

public class WindowButton implements Button {
    @Override
    public void click() {
        System.out.println("click by Window");
    }
}

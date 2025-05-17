package org.example.bt7.Mac;

import org.example.bt7.Button;

public class MacButton implements Button {
    @Override
    public void click() {
        System.out.println("click by Mac");
    }
}

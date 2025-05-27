package org.example.Bridge_Pattern.BT2;

public abstract class Documents {
    protected DeviceRender render;

    public Documents(DeviceRender render) {
        this.render = render;
    }

    public abstract void display();
}

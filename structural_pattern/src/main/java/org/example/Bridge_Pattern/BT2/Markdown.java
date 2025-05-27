package org.example.Bridge_Pattern.BT2;

public class Markdown extends Documents{

    public Markdown(DeviceRender render) {
        super(render);
    }

    @Override
    public void display() {
        System.out.println("This is markdown");
    }
}

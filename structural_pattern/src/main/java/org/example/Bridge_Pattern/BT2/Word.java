package org.example.Bridge_Pattern.BT2;

public class Word extends Documents{
    public Word(DeviceRender render) {
        super(render);
    }

    @Override
    public void display() {
        System.out.println("this is Word");
    }
}

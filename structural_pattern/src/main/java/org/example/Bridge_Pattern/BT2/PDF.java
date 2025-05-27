package org.example.Bridge_Pattern.BT2;

public class PDF extends Documents{

    public PDF(DeviceRender render) {
        super(render);
    }

    @Override
    public void display() {
        System.out.println("this is PDF");
    }
}

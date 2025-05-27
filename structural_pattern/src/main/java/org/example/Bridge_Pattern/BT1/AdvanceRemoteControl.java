package org.example.Bridge_Pattern.BT1;

public class AdvanceRemoteControl extends RemoteControl{

    public AdvanceRemoteControl(TV tv) {
        super(tv);
    }

    public void nextChannel(){
        System.out.println("Next to channel");
        tv.setChannel(1);
    }

    public void previousChannel(){
        System.out.println("Back to channel");
        tv.setChannel(0);
    }
}

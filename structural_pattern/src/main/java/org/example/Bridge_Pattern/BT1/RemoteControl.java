package org.example.Bridge_Pattern.BT1;

public class RemoteControl {
    protected TV tv;

    public RemoteControl(TV tv) {
        this.tv = tv;
    }

    public void tunrON(){
        tv.on();
    }

    public void tunrOFF(){
        tv.off();
    }
    public void setChannel(int channel){
        tv.setChannel(channel);
    }
}

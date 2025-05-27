package org.example.Bridge_Pattern.BT1;

public class Main {
    public static void main(String[] args) {
        TV samsung = new SamSUng();
        TV sony =  new Sony();

        RemoteControl samsungRemote = new RemoteControl(samsung);
        samsungRemote.tunrON();
        samsungRemote.setChannel(5);
        samsungRemote.tunrOFF();

        System.out.println();

        RemoteControl sonyRemoteControl = new RemoteControl(sony);
        sonyRemoteControl.tunrON();
        sonyRemoteControl.setChannel(1);
        sonyRemoteControl.tunrOFF();

        System.out.println();

        AdvanceRemoteControl remoteControl = new AdvanceRemoteControl(samsung);
        remoteControl.tunrON();
        remoteControl.setChannel(0);
        remoteControl.nextChannel();
        remoteControl.previousChannel();
        remoteControl.tunrOFF();
    }
}

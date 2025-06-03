package org.example.Command;

public class main {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();
        Light light = new Light();
        Fan fan = new Fan();

        Command lightOn = new LightOnCommand(light);
        Command lightOff = new LightOffCommand(light);

        Command fanOn = new FanOnCommand(fan);
        Command fanOff = new FanOffCommand(fan);

        remoteControl.pressButton(lightOn);
        remoteControl.pressButton(fanOn);
        remoteControl.pressButton(lightOff);

        remoteControl.pressUndo();
        remoteControl.pressUndo();
        remoteControl.pressUndo();
        remoteControl.pressUndo();

    }
}

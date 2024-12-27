package org.designpatterns.behavioural.CommandPattern.WithPattern;

// SHCommand Interface
interface SHCommand {
    void execute();
}

// Concrete SHCommands
class TurnOnLightSHCommand implements SHCommand {
    private Light light;

    public TurnOnLightSHCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOn();
    }
}

class TurnOffLightSHCommand implements SHCommand {
    private Light light;

    public TurnOffLightSHCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOff();
    }
}

// Receiver
class Light {
    public void turnOn() {
        System.out.println("Light is ON");
    }

    public void turnOff() {
        System.out.println("Light is OFF");
    }
}

// Invoker
class RemoteControl {
    private SHCommand SHCommand;

    public void setSHCommand(SHCommand SHCommand) {
        this.SHCommand = SHCommand;
    }

    public void pressButton() {
        if (SHCommand != null) {
            SHCommand.execute();
        }
    }
}

// Main
public class SmartHomeAutomation {
    public static void main(String[] args) {
        Light light = new Light();
        SHCommand turnOnSHCommand = new TurnOnLightSHCommand(light);
        SHCommand turnOffSHCommand = new TurnOffLightSHCommand(light);

        RemoteControl remote = new RemoteControl();

        remote.setSHCommand(turnOnSHCommand);
        remote.pressButton(); // Light is ON

        remote.setSHCommand(turnOffSHCommand);
        remote.pressButton(); // Light is OFF
    }
}


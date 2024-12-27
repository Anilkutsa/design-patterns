package org.designpatterns.behavioural.ObserverPattern.WithPattern.observer;

public class DisplayDeviceIn implements Observer {

    String name;

    public DisplayDeviceIn(String deviceName) {
        this.name = deviceName;
    }

    @Override
    public void update(float temp) {
        System.out.println("Temp on " + name + " device is " + temp);
    }
}

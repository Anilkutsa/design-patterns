package org.designpatterns.behavioural.observer.observer;

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

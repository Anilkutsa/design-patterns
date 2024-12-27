package org.designpatterns.behavioural.ObserverPattern.WithoutPattern;

/**
 *
 * Suppose we have a weather station that records temperature and multiple devices
 * (e.g., display units) want to show the latest temperature.
 *
 * Without using the observer pattern, the weather station would have to explicitly
 * inform each device about the temperature change, which results in tight coupling
 * between the station and devices.
 */
class DisplayDevice {
    public void showTemp(float temp) {
        System.out.println("Current Temp: " + temp + " C");
    }
}

class WeatherStation {

    private float temperature;
    private DisplayDevice displayDevice; //can be multiple such devices later on

    public WeatherStation(DisplayDevice displayDevice) {
        this.displayDevice = displayDevice;
    }

    public void setTemperature(float temp) {
        this.temperature = temp;
        notifyDevice();
    }

    public void notifyDevice() {
        displayDevice.showTemp(temperature);
    }

}

public class WithoutObserverPattern {
    public static void main(String[] args) {
        DisplayDevice device = new DisplayDevice();
        WeatherStation station = new WeatherStation(device);
        //Tight Coupling B/w station and the device
        station.setTemperature(26);
        station.setTemperature(30);
    }
}

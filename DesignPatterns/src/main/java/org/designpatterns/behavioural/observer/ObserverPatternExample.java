package org.designpatterns.behavioural.observer;

import org.designpatterns.behavioural.observer.observer.DisplayDeviceIn;
import org.designpatterns.behavioural.observer.observer.MobileDevice;
import org.designpatterns.behavioural.observer.subject.WeatherStationIn;

public class ObserverPatternExample {

    public static void main(String[] args) {
        //Create a Publisher
        WeatherStationIn weatherStationIn = new WeatherStationIn();

        //Create subscribers
        DisplayDeviceIn device = new DisplayDeviceIn("SamsungLCD");
        MobileDevice mobileDevice = new MobileDevice();

        //Attach
        weatherStationIn.attach(device);
        weatherStationIn.attach(mobileDevice);

        //Set Temp
        weatherStationIn.setTemperature(25);

        //Detach
        weatherStationIn.detach(mobileDevice);

        weatherStationIn.setTemperature(26);

    }

}

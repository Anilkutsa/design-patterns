package org.designpatterns.behavioural.ObserverPattern.WithPattern;

import org.designpatterns.behavioural.ObserverPattern.WithPattern.observer.DisplayDeviceIn;
import org.designpatterns.behavioural.ObserverPattern.WithPattern.observer.MobileDevice;
import org.designpatterns.behavioural.ObserverPattern.WithPattern.subject.WeatherStationIn;

/**
 * The Observer Pattern is a behavioral design pattern where an object, called the Subject,
 * maintains a list of dependents, called Observers, and notifies them of any state changes.
 * This creates a one-to-many relationship, where multiple Observers can react to changes in a Subject's state.
 * The Subject provides methods for attaching, detaching, and notifying Observers,
 * while each Observer implements an update method to handle notifications.
 *
 * This pattern is important for decoupling components, as the Subject doesn’t need to know the details of its Observers.
 * It’s commonly used in event-driven systems, GUIs, and data-binding scenarios where real-time updates are needed.
 * For example, in a UI framework, a button (Subject) notifies listeners (Observers) when clicked.
 * This enables flexible and scalable systems but can add overhead if the number of Observers grows significantly.
 */
public class ObserverPatternExample {

    public static void main(String[] args) {

        //Create a Subject (Publisher)
        WeatherStationIn weatherStationIn = new WeatherStationIn();

        //Create Observers (Subscribers)
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

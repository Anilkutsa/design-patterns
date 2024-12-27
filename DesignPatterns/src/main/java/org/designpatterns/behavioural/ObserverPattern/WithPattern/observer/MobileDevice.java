package org.designpatterns.behavioural.ObserverPattern.WithPattern.observer;

public class MobileDevice implements Observer {
    @Override
    public void update(float temp) {
        System.out.println("Temp on mobile is " + temp);
    }
}

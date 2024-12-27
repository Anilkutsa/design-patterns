package org.designpatterns.behavioural.observer.observer;

public class MobileDevice implements Observer {
    @Override
    public void update(float temp) {
        System.out.println("Temp on mobile is " + temp);
    }
}

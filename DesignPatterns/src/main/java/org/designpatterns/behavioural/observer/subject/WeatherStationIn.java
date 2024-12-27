package org.designpatterns.behavioural.observer.subject;

import org.designpatterns.behavioural.observer.observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherStationIn implements Subject {
    private float temperature;
    private List<Observer> observerList;

    public WeatherStationIn() {
        observerList = new ArrayList<>(); //Empty
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
        notifyObservers();
    }

    @Override
    public void attach(Observer obs) {
        observerList.add(obs);
    }

    @Override
    public void detach(Observer obs) {
        observerList.remove(obs);
    }

    @Override
    public void notifyObservers() {
        for (Observer obs : observerList) {
            obs.update(temperature); //Run Time Polymorphism
        }
    }
}

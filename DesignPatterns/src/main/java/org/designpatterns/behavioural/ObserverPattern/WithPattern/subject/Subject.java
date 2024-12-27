package org.designpatterns.behavioural.ObserverPattern.WithPattern.subject;

import org.designpatterns.behavioural.ObserverPattern.WithPattern.observer.Observer;

public interface Subject {

    void attach(Observer obs);

    void detach(Observer obs);

    void notifyObservers();
}

package org.designpatterns.behavioural.observer.subject;

import org.designpatterns.behavioural.observer.observer.Observer;

public interface Subject {

    void attach(Observer obs);

    void detach(Observer obs);

    void notifyObservers();
}

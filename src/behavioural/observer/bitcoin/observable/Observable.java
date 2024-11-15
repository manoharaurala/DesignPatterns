package behavioural.observer.bitcoin.observable;

import behavioural.observer.bitcoin.observer.Observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Observable {
    List<Observer> observers;

    public Observable() {
        observers = new ArrayList<>();
    }

    public void register(Observer observer) {
        observers.add(observer);
    }

    public void deRegister(Observer observer) {
        observers.remove(observer);
    }

    public void notifyChange() {
        observers.forEach(Observer::notifyChange);
    }
}

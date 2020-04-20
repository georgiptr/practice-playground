package headfirstdesignpatterns.compound.observable;

import java.util.ArrayList;
import java.util.List;

public class Observable implements QuackObservable {

    private List<Observer> observers = new ArrayList<>();
    private QuackObservable duck;

    public Observable(QuackObservable duck) {
        this.duck = duck;
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObservers() {
        observers.forEach(observer -> observer.update(duck));
    }
}

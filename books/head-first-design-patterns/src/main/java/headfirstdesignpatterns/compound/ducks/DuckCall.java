package headfirstdesignpatterns.compound.ducks;

import headfirstdesignpatterns.compound.observable.Observable;
import headfirstdesignpatterns.compound.observable.Observer;

public class DuckCall implements Quackable {
    private Observable observable;

    public DuckCall() {
        observable = new Observable(this);
    }

    @Override
    public void quack() {
        System.out.println("Kwak");
    }

    @Override
    public void registerObserver(Observer observer) {
        observable.registerObserver(observer);
    }

    @Override
    public void notifyObservers() {
        observable.notifyObservers();
    }

    @Override
    public String toString() {
        return "Duck Call";
    }

}

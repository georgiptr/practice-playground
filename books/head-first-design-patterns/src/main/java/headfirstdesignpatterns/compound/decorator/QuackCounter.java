package headfirstdesignpatterns.compound.decorator;

import headfirstdesignpatterns.compound.ducks.Quackable;
import headfirstdesignpatterns.compound.observable.Observable;
import headfirstdesignpatterns.compound.observable.Observer;

public class QuackCounter implements Quackable {

    private Quackable duck;
    private static int numberOfQuacks;
    private Observable observable;

    public QuackCounter(Quackable duck) {
        this.duck = duck;
        this.observable = new Observable(this);
    }

    public static int getNumberOfQuacks() {
        return numberOfQuacks;
    }

    @Override
    public void quack() {
        duck.quack();
        numberOfQuacks++;
        notifyObservers();
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
        return duck.toString();
    }
}

package headfirstdesignpatterns.compound.composite;

import headfirstdesignpatterns.compound.ducks.Quackable;
import headfirstdesignpatterns.compound.observable.Observable;
import headfirstdesignpatterns.compound.observable.Observer;

import java.util.ArrayList;
import java.util.List;

public class Flock implements Quackable {

    private List<Quackable> quackers = new ArrayList<Quackable>();

    public void add(Quackable quacker) {
        quackers.add(quacker);
    }

    @Override
    public void quack() {
        quackers.forEach(Quackable::quack);
    }

    @Override
    public void registerObserver(Observer observer) {
        quackers.forEach(q->q.registerObserver(observer));
    }

    @Override
    public void notifyObservers() {
        quackers.forEach(q->q.notifyObservers());
    }
}
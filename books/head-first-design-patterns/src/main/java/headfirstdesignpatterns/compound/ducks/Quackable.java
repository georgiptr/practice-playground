package headfirstdesignpatterns.compound.ducks;

import headfirstdesignpatterns.compound.observable.QuackObservable;

public interface Quackable extends QuackObservable {
    void quack();
}

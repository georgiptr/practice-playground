package headfirstdesignpatterns.compound.factory;

import headfirstdesignpatterns.compound.ducks.Quackable;

public abstract class AbstractDuckFactory {

    public abstract Quackable createMallardDuck();
    public abstract Quackable createRedheadDuck();
    public abstract Quackable createDuckCall();
    public abstract Quackable createRubberDuck();

}

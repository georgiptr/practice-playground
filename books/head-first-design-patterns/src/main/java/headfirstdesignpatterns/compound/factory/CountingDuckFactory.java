package headfirstdesignpatterns.compound.factory;

import headfirstdesignpatterns.compound.decorator.QuackCounter;
import headfirstdesignpatterns.compound.ducks.DuckCall;
import headfirstdesignpatterns.compound.ducks.MallardDuck;
import headfirstdesignpatterns.compound.ducks.Quackable;
import headfirstdesignpatterns.compound.ducks.RedheadDuck;

public class CountingDuckFactory extends AbstractDuckFactory {
    @Override
    public Quackable createMallardDuck() {
        return new QuackCounter(new MallardDuck());
    }

    @Override
    public Quackable createRedheadDuck() {
        return new QuackCounter(new RedheadDuck());
    }

    @Override
    public Quackable createDuckCall() {
        return new QuackCounter(new DuckCall());
    }

    @Override
    public Quackable createRubberDuck() {
        return new QuackCounter(new RedheadDuck());
    }
}

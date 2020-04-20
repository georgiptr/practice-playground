package headfirstdesignpatterns.compound.factory;

import headfirstdesignpatterns.compound.ducks.DuckCall;
import headfirstdesignpatterns.compound.ducks.MallardDuck;
import headfirstdesignpatterns.compound.ducks.Quackable;
import headfirstdesignpatterns.compound.ducks.RedheadDuck;

public class DuckFactory extends AbstractDuckFactory {
    @Override
    public Quackable createMallardDuck() {
        return new MallardDuck();
    }

    @Override
    public Quackable createRedheadDuck() {
        return new RedheadDuck();
    }

    @Override
    public Quackable createDuckCall() {
        return new DuckCall();
    }

    @Override
    public Quackable createRubberDuck() {
        return new RedheadDuck();
    }
}

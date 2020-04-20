package headfirstdesignpatterns.compound.v6;

import headfirstdesignpatterns.compound.adapter.GooseAdapter;
import headfirstdesignpatterns.compound.composite.Flock;
import headfirstdesignpatterns.compound.decorator.QuackCounter;
import headfirstdesignpatterns.compound.ducks.Quackable;
import headfirstdesignpatterns.compound.factory.AbstractDuckFactory;
import headfirstdesignpatterns.compound.factory.CountingDuckFactory;
import headfirstdesignpatterns.compound.goose.Goose;
import headfirstdesignpatterns.compound.observable.Quackologist;
import org.junit.Test;

public class DuckSimulator {

    @Test
    public void start() {
        AbstractDuckFactory factory = new CountingDuckFactory();
        simulate(factory);
    }

    public void simulate(AbstractDuckFactory factory) {
        Quackable redheadDuck = factory.createRedheadDuck();
        Quackable duckCall = factory.createDuckCall();
        Quackable rubberDuck = factory.createRubberDuck();
        Quackable gooseDuck = new GooseAdapter(new Goose());

        System.out.println("Duck Simulator: With Observer");

        Flock flockOfDucks = new Flock();
        flockOfDucks.add(redheadDuck);
        flockOfDucks.add(duckCall);
        flockOfDucks.add(rubberDuck);
        flockOfDucks.add(gooseDuck);

        Flock flockOfMallards = new Flock();
        flockOfMallards.add(factory.createMallardDuck());
        flockOfMallards.add(factory.createMallardDuck());
        flockOfMallards.add(factory.createMallardDuck());
        flockOfMallards.add(factory.createMallardDuck());

        Quackologist quackologist = new Quackologist();
        flockOfDucks.registerObserver(quackologist);
        flockOfMallards.registerObserver(quackologist);

        simulate(flockOfDucks);
        simulate(flockOfMallards);

        System.out.println("The ducks quacked " + QuackCounter.getNumberOfQuacks() + " times");
    }

    private void simulate(Quackable duck) {
        duck.quack();
    }
}

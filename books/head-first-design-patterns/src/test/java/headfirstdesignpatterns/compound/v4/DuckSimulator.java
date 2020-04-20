package headfirstdesignpatterns.compound.v4;

import headfirstdesignpatterns.compound.adapter.GooseAdapter;
import headfirstdesignpatterns.compound.decorator.QuackCounter;
import headfirstdesignpatterns.compound.ducks.*;
import headfirstdesignpatterns.compound.factory.AbstractDuckFactory;
import headfirstdesignpatterns.compound.factory.CountingDuckFactory;
import headfirstdesignpatterns.compound.goose.Goose;
import org.junit.Test;

public class DuckSimulator {

    @Test
    public void start() {
        AbstractDuckFactory factory = new CountingDuckFactory();
        simulate(factory);
    }

    public void simulate(AbstractDuckFactory factory) {
        Quackable mallardDuck = factory.createMallardDuck();
        Quackable redheadDuck = factory.createRedheadDuck();
        Quackable duckCall = factory.createDuckCall();
        Quackable rubberDuck = factory.createRubberDuck();
        Quackable gooseDuck = new GooseAdapter(new Goose()); // Skipped decoration!

        System.out.println("Duck Simulator");

        simulate(mallardDuck);
        simulate(redheadDuck);
        simulate(duckCall);
        simulate(rubberDuck);
        simulate(gooseDuck);

        System.out.println("The ducks quacked " + QuackCounter.getNumberOfQuacks() + " times");
    }

    private void simulate(Quackable quackable) {
        quackable.quack();
    }
}

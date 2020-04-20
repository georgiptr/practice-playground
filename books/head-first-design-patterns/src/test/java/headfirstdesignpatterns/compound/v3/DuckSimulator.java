package headfirstdesignpatterns.compound.v3;

import headfirstdesignpatterns.compound.adapter.GooseAdapter;
import headfirstdesignpatterns.compound.decorator.QuackCounter;
import headfirstdesignpatterns.compound.ducks.*;
import headfirstdesignpatterns.compound.goose.Goose;
import org.junit.Test;

public class DuckSimulator {

    @Test
    public void simulate() {
        Quackable mallardDuck = new QuackCounter(new MallardDuck());
        Quackable redheadDuck = new QuackCounter(new RedheadDuck());
        Quackable duckCall = new QuackCounter(new DuckCall());
        Quackable rubberDuck = new QuackCounter(new RubberDuck());
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

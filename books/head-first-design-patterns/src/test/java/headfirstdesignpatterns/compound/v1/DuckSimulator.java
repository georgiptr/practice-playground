package headfirstdesignpatterns.compound.v1;

import headfirstdesignpatterns.compound.ducks.*;
import org.junit.Test;

public class DuckSimulator {

    @Test
    public void simulate() {
        Quackable mallardDuck = new MallardDuck();
        Quackable redheadDuck = new RedheadDuck();
        Quackable duckCall = new DuckCall();
        Quackable rubberDuck = new RubberDuck();

        System.out.println("Duck Simulator");

        simulate(mallardDuck);
        simulate(redheadDuck);
        simulate(duckCall);
        simulate(rubberDuck);
    }

    private void simulate(Quackable quackable) {
        quackable.quack();
    }
}

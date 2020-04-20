package headfirstdesignpatterns.compound.v2;

import headfirstdesignpatterns.compound.adapter.GooseAdapter;
import headfirstdesignpatterns.compound.ducks.*;
import headfirstdesignpatterns.compound.goose.Goose;
import org.junit.Test;

public class DuckSimulator {

    @Test
    public void simulate() {
        Quackable mallardDuck = new MallardDuck();
        Quackable redheadDuck = new RedheadDuck();
        Quackable duckCall = new DuckCall();
        Quackable rubberDuck = new RubberDuck();
        Quackable gooseDuck = new GooseAdapter(new Goose());

        System.out.println("Duck Simulator");

        simulate(mallardDuck);
        simulate(redheadDuck);
        simulate(duckCall);
        simulate(rubberDuck);
        simulate(gooseDuck);
    }

    private void simulate(Quackable quackable) {
        quackable.quack();
    }
}

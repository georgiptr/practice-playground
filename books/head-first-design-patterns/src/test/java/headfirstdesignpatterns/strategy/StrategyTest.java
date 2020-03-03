package headfirstdesignpatterns.strategy;

import org.junit.Test;
import headfirstdesignpatterns.strategy.ducks.DecoyDuck;
import headfirstdesignpatterns.strategy.ducks.MallardDuck;
import headfirstdesignpatterns.strategy.flybehaviors.FlyNoFly;

public class StrategyTest {

    @Test
    public void playgroundTest() {
        Duck duck = new DecoyDuck();
        duck.display();
        duck.performFly();
        duck.performQuack();

        duck = new MallardDuck();
        duck.display();
        duck.performFly();
        duck.performQuack();

        duck.setFlyBehavior(new FlyNoFly());
        duck.performFly();
    }

}

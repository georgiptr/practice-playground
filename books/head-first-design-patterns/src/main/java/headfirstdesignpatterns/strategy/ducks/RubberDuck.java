package headfirstdesignpatterns.strategy.ducks;

import headfirstdesignpatterns.strategy.Duck;
import headfirstdesignpatterns.strategy.flybehaviors.FlyNoFly;
import headfirstdesignpatterns.strategy.quackbehaviors.Squeak;

public class RubberDuck extends Duck {

    public RubberDuck() {
        setQuackBehavior(new Squeak());
        setFlyBehavior(new FlyNoFly());
    }

    @Override
    public void display() {
        System.out.println("RubberDuck");
    }
}

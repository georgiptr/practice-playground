package headfirstdesignpatterns.strategy.ducks;

import headfirstdesignpatterns.strategy.Duck;
import headfirstdesignpatterns.strategy.flybehaviors.FlyWithWings;
import headfirstdesignpatterns.strategy.quackbehaviors.Quack;

public class MallardDuck extends Duck {

    public MallardDuck() {
        setFlyBehavior(new FlyWithWings());
        setQuackBehavior(new Quack());
    }

    @Override
    public void display() {
        System.out.println("MallardDuck");
    }
}

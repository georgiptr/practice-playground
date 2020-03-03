package headfirstdesignpatterns.strategy.ducks;

import headfirstdesignpatterns.strategy.Duck;
import headfirstdesignpatterns.strategy.flybehaviors.FlyNoFly;
import headfirstdesignpatterns.strategy.quackbehaviors.MuteQuack;

public class DecoyDuck extends Duck {

    public DecoyDuck() {
        setFlyBehavior(new FlyNoFly());
        setQuackBehavior(new MuteQuack());
    }

    @Override
    public void display() {
        System.out.println("DecoyDuck");
    }
}

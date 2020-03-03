package headfirstdesignpatterns.strategy.flybehaviors;

import headfirstdesignpatterns.strategy.FlyBehavior;

public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("Flying with wings");
    }
}

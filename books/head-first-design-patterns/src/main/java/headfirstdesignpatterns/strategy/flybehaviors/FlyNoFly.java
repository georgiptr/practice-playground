package headfirstdesignpatterns.strategy.flybehaviors;

import headfirstdesignpatterns.strategy.FlyBehavior;

public class FlyNoFly implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("Not flying");
    }
}

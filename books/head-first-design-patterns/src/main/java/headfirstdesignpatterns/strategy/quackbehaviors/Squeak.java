package headfirstdesignpatterns.strategy.quackbehaviors;

import headfirstdesignpatterns.strategy.QuackBehavior;

public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Squeak");
    }
}

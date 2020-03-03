package headfirstdesignpatterns.strategy.quackbehaviors;

import headfirstdesignpatterns.strategy.QuackBehavior;

public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Quack");
    }
}

package headfirstdesignpatterns.strategy.quackbehaviors;

import headfirstdesignpatterns.strategy.QuackBehavior;

public class MuteQuack implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("<<no sound>>");
    }
}

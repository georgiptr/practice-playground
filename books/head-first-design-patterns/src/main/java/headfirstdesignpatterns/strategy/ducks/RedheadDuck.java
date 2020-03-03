package headfirstdesignpatterns.strategy.ducks;

import headfirstdesignpatterns.strategy.Duck;

public class RedheadDuck extends Duck {

    @Override
    public void display() {
        System.out.println("RedheadDuck");
    }
}

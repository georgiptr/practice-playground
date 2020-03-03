package headfirstdesignpatterns.factory.simple;

import org.junit.Test;

public class SimpleFactoryTest {

    @Test
    public void factoryTestPlayground() {
        SimplePizzaFactory simplePizzaFactory = new SimplePizzaFactory();
        PizzaStore pizzaStore = new PizzaStore(simplePizzaFactory);
        Pizza pizza = pizzaStore.orderPizza("cheese");
    }
}

package headfirstdesignpatterns.factory.method;

import org.junit.Test;

public class MethodFactoryTest {

    @Test
    public void test() {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();
        PizzaStore californiaStore = new CaliforniaPizzaStore();

        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("Ethan ordered a " + pizza.getName() + "\n");

        pizza = chicagoStore.orderPizza("cheese");
        System.out.println("Joel ordered a " + pizza.getName() + "\n");

        pizza = californiaStore.orderPizza("cheese");
        System.out.println("Prince ordered a " + pizza.getName() + "\n");
    }
}

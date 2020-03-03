package headfirstdesignpatterns.factory.method;

import headfirstdesignpatterns.factory.method.california.CaliforniaStyleCheesePizza;

public class CaliforniaPizzaStore extends PizzaStore {

    public Pizza createPizza(String type) {
        Pizza pizza = null;

        if (type.equals("cheese")) {
            pizza = new CaliforniaStyleCheesePizza();
        }

        return pizza;
    }
}

package headfirstdesignpatterns.factory.method;

import headfirstdesignpatterns.factory.method.ny.NYStyleCheesePizza;

public class NYPizzaStore extends PizzaStore {

    public Pizza createPizza(String type) {
        Pizza pizza = null;

        if (type.equals("cheese")) {
            pizza = new NYStyleCheesePizza();
        }

        return pizza;
    }
}

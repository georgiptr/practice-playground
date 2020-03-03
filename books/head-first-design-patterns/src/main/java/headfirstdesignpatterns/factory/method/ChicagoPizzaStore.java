package headfirstdesignpatterns.factory.method;

import headfirstdesignpatterns.factory.method.chicago.ChicagoStyleCheesePizza;

public class ChicagoPizzaStore extends PizzaStore {

    public Pizza createPizza(String type) {
        Pizza pizza = null;

        if (type.equals("cheese")) {
            pizza = new ChicagoStyleCheesePizza();
        }

        return pizza;
    }
}

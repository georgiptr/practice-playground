package headfirstdesignpatterns.factory.abstractfactory.newyork;

import headfirstdesignpatterns.factory.abstractfactory.Pizza;
import headfirstdesignpatterns.factory.abstractfactory.PizzaIngredientFactory;
import headfirstdesignpatterns.factory.abstractfactory.pizzas.CheesePizza;
import headfirstdesignpatterns.factory.abstractfactory.pizzas.ClamPizza;
import headfirstdesignpatterns.factory.simple.PizzaStore;
import headfirstdesignpatterns.factory.simple.SimplePizzaFactory;

public class NYPizzaStore extends PizzaStore {

    public NYPizzaStore(SimplePizzaFactory factory) {
        super(factory);
    }

    public Pizza createPizza(String item) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();

        if (item.equals("cheese")) {
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("New York Style Cheese Pizza");
        } else if (item.equals("clam")) {
            pizza = new ClamPizza(ingredientFactory);
            pizza.setName("New York Style Clam Pizza");
        }

        return pizza;
    }
}

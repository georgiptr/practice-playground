package headfirstdesignpatterns.factory.abstractfactory.pizzas;

import headfirstdesignpatterns.factory.abstractfactory.Pizza;
import headfirstdesignpatterns.factory.abstractfactory.PizzaIngredientFactory;
import headfirstdesignpatterns.factory.abstractfactory.ingredients.Cheese;
import headfirstdesignpatterns.factory.abstractfactory.ingredients.Dough;
import headfirstdesignpatterns.factory.abstractfactory.ingredients.Sauce;

public class ClamPizza extends Pizza {

    PizzaIngredientFactory ingredientFactory;

    public ClamPizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    public void prepare() {
        System.out.println("Preparing " + name);
        Dough dough = ingredientFactory.createDough();
        Sauce sauce = ingredientFactory.createSauce();
        Cheese cheese = ingredientFactory.createCheese();

    }
}

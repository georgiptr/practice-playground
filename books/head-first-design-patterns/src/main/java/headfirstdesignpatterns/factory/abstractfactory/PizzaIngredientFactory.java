package headfirstdesignpatterns.factory.abstractfactory;

import headfirstdesignpatterns.factory.abstractfactory.ingredients.Cheese;
import headfirstdesignpatterns.factory.abstractfactory.ingredients.Clams;
import headfirstdesignpatterns.factory.abstractfactory.ingredients.Dough;
import headfirstdesignpatterns.factory.abstractfactory.ingredients.Pepperoni;
import headfirstdesignpatterns.factory.abstractfactory.ingredients.Sauce;
import headfirstdesignpatterns.factory.abstractfactory.ingredients.Veggies;

public interface PizzaIngredientFactory {

    Dough createDough();
    Sauce createSauce();
    Cheese createCheese();
    Veggies[] createVeggies();
    Pepperoni createPepperoni();
    Clams createClam();

}

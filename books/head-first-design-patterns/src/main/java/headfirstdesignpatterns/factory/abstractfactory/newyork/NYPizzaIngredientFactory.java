package headfirstdesignpatterns.factory.abstractfactory.newyork;

import headfirstdesignpatterns.factory.abstractfactory.PizzaIngredientFactory;
import headfirstdesignpatterns.factory.abstractfactory.ingredients.Cheese;
import headfirstdesignpatterns.factory.abstractfactory.ingredients.Clams;
import headfirstdesignpatterns.factory.abstractfactory.ingredients.Dough;
import headfirstdesignpatterns.factory.abstractfactory.ingredients.FreshClam;
import headfirstdesignpatterns.factory.abstractfactory.ingredients.Pepperoni;
import headfirstdesignpatterns.factory.abstractfactory.ingredients.Sauce;
import headfirstdesignpatterns.factory.abstractfactory.ingredients.Veggies;
import headfirstdesignpatterns.factory.abstractfactory.ingredients.veggies.Garlic;
import headfirstdesignpatterns.factory.abstractfactory.ingredients.veggies.Mushroom;
import headfirstdesignpatterns.factory.abstractfactory.ingredients.veggies.Onion;
import headfirstdesignpatterns.factory.abstractfactory.ingredients.veggies.RedPepper;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new MarinataSauce();
    }

    @Override
    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        Veggies veggies[] = {new Garlic(), new Onion(), new Mushroom(), new RedPepper()};
        return veggies;
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clams createClam() {
        return new FreshClam();
    }
}

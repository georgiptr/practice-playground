package headfirstdesignpatterns.factory.abstractfactory;

import headfirstdesignpatterns.factory.abstractfactory.ingredients.Cheese;
import headfirstdesignpatterns.factory.abstractfactory.ingredients.Clams;
import headfirstdesignpatterns.factory.abstractfactory.ingredients.Dough;
import headfirstdesignpatterns.factory.abstractfactory.ingredients.Pepperoni;
import headfirstdesignpatterns.factory.abstractfactory.ingredients.Sauce;
import headfirstdesignpatterns.factory.abstractfactory.ingredients.Veggies;

public abstract class Pizza {
    protected String name;

    Dough dough;
    Sauce sauce;
    Veggies veggies;
    Cheese cheese;
    Pepperoni pepperoni;
    Clams clams;

    public abstract void prepare();

    public void bake() {
        System.out.println("Bake for 25 minutes at 350");
    }

    public void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }

    public void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

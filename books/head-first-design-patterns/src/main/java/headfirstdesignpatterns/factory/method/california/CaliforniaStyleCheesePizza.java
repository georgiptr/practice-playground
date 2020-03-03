package headfirstdesignpatterns.factory.method.california;

import headfirstdesignpatterns.factory.method.Pizza;

public class CaliforniaStyleCheesePizza extends Pizza {

    public CaliforniaStyleCheesePizza() {
        name = "California Style Super Super Dish Cheese Pizza";
        dough = "Alien Crust Dough";
        sauce = "Cucumber Sauce";

        toppings.add("Invisible Cheese");
    }

    @Override
    public void cut() {
        System.out.println("Cutting the pizza into triangle slices");
    }
}

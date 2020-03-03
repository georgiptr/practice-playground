package headfirstdesignpatterns.decorator;

public class DarkRoast extends Beverage {

    @Override
    public double cost() {
        return 2;
    }

    @Override
    public String getDescription() {
        return "Dark Roast";
    }
}

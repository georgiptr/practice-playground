package headfirstdesignpatterns.decorator;

public class Mocca extends Beverage {

    private Beverage beverage;

    public Mocca(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.2;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " Mocca";
    }
}

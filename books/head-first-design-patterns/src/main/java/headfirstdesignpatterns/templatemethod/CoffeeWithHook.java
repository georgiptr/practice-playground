package headfirstdesignpatterns.templatemethod;

public class CoffeeWithHook extends CaffeineBeverageWithHook {
    @Override
    void brew() {
        System.out.println("Brewing the coffee");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding sugar");
    }

    @Override
    boolean customerWantsCondiments() {
        return true;
    }
}

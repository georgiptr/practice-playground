package headfirstdesignpatterns.templatemethod;

public abstract class CaffeineBeverageWithHook {
    final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        if (customerWantsCondiments()) {
            addCondiments();
        }
    }

    abstract void brew();

    abstract void addCondiments();

    void boilWater() {
        System.out.println("Boiling the water");
    }

    void pourInCup() {
        System.out.println("Pouring in a cup");
    }

    // hook
    boolean customerWantsCondiments() {
        return false;
    }
}

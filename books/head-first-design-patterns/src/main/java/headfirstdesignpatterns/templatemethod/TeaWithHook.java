package headfirstdesignpatterns.templatemethod;

public class TeaWithHook extends CaffeineBeverageWithHook {
    @Override
    void brew() {
        System.out.println("Brewing the tea");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding sugar");
    }
}

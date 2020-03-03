package headfirstdesignpatterns.templatemethod;


import org.junit.Test;

public class TemplateMethodTest {

    @Test
    public void templateMethodTest() {
        System.out.println("Coffee:");
        new CoffeeWithHook().prepareRecipe();
        System.out.println("Tea:");
        new TeaWithHook().prepareRecipe();
    }
}

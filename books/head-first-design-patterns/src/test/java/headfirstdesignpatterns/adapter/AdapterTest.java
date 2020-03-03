package headfirstdesignpatterns.adapter;

import org.junit.Test;

public class AdapterTest {

    @Test
    public void test() {
        MallardDuck duck = new MallardDuck();

        WildTurkey turkey = new WildTurkey();
        Duck turkeyAdapter = new TurkeyAdapter(turkey);

        System.out.println("The Turkey says...");
        turkey.gobble();
        turkey.fly();

        System.out.println("The Duck says...");
        testDuck(duck);

        System.out.println("The TurkeyAdapter says...");
        testDuck(turkeyAdapter);
    }

    private void testDuck(Duck duck) {
        duck.quack();
        duck.fly();
    }
}

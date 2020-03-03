package headfirstdesignpatterns.iterator;

import org.junit.Test;

import java.math.BigDecimal;

public class IteratorTest {

    @Test
    public void iteratorTest() {
        DinerMenu dinerMenu = new DinerMenu();
        dinerMenu.addItem("Diner meal 1", BigDecimal.valueOf(10));
        dinerMenu.addItem("Diner meal 2", BigDecimal.valueOf(12.99));

        LunchMenu lunchMenu = new LunchMenu();
        lunchMenu.addItem("Lunch meal 1", BigDecimal.valueOf(15));
        lunchMenu.addItem("Lunch meal 2", BigDecimal.valueOf(18.99));

        Waitress waitress = new Waitress(dinerMenu.createIterator(), lunchMenu.createIterator());
        waitress.printAllMenus();
    }
}

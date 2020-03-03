package headfirstdesignpatterns.iterator;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

class LunchMenu {

    private List<MenuItem> menuItems = new ArrayList<>();

    public void addItem(String title, BigDecimal price) {
        menuItems.add(new MenuItem(title, price));
    }

    public LunchMenuIterator createIterator() {
        return new LunchMenuIterator(menuItems);
    }

}

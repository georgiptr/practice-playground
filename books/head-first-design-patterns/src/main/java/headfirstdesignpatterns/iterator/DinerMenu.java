package headfirstdesignpatterns.iterator;

import java.math.BigDecimal;

class DinerMenu {

    private final int MAX_ITEMS = 6;
    private int numberOfItems = 0;
    private final MenuItem[] menuItems = new MenuItem[MAX_ITEMS];

    public void addItem(String title, BigDecimal price) {
        if (numberOfItems >= MAX_ITEMS) {
            System.out.println("Sorry, maximum amount of items already reached");
            return;
        }
        menuItems[numberOfItems++] = new MenuItem(title, price);
    }

    public DinerMenuIterator createIterator() {
        return new DinerMenuIterator(menuItems);
    }

}

package headfirstdesignpatterns.iterator;

import java.util.Iterator;

class DinerMenuIterator implements Iterator {

    private final MenuItem[] menuItems;
    private int position = 0;

    public DinerMenuIterator(MenuItem[] menuItems) {
        this.menuItems = menuItems;
    }

    @Override
    public boolean hasNext() {
        return (position < menuItems.length && menuItems[position] != null);
    }

    @Override
    public MenuItem next() {
        return menuItems[position++];
    }
}

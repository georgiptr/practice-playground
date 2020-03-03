package headfirstdesignpatterns.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class LunchMenuIterator implements Iterator {

    private List<MenuItem> menuItems;
    private int position = 0;

    public LunchMenuIterator(List<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    @Override
    public boolean hasNext() {
        return (position < menuItems.size() && menuItems.get(position) != null);
    }

    @Override
    public MenuItem next() {
        return menuItems.get(position++);

    }
}

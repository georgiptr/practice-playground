package headfirstdesignpatterns.iterator;

import java.util.Iterator;

class Waitress {

    private final Iterator[] iterators;

    public Waitress(Iterator ...iterators) {
        this.iterators = iterators;
    }

    public void printAllMenus() {
        for (Iterator <MenuItem>i : iterators) {
            while (i.hasNext()) {
                MenuItem menuItem = i.next();
                System.out.println(menuItem.getTitle() + ", " + menuItem.getPrice());
            }
        }
    }
}

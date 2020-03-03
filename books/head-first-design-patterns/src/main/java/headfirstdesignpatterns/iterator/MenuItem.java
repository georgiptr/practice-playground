package headfirstdesignpatterns.iterator;

import java.math.BigDecimal;

class MenuItem {

    private final String title;
    private final BigDecimal price;

    public MenuItem(String title, BigDecimal price) {
        this.title = title;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public BigDecimal getPrice() {
        return price;
    }
}

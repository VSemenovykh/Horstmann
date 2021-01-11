package ru.ncedu.horstmann.inheritanceandreflection.item;

import java.util.Objects;

/**
 * This class Item
 * Exercises 6
 * Suppose that in Section 4.2.2, “The equals Method” (page 148), the
 * Item.equals method uses an instanceof test. Implement DiscountedItem.equals so
 * that it compares only the superclass if otherObject is an Item, but also includes
 * the discount if it is a DiscountedItem. Show that this method preserves
 * symmetry but fails to be transitive—that is, find a combination of items
 * and discounted items so that x.equals(y) and y.equals(z), but not x.equals(z).
 * @version 1.0, 6 Jan 2021
 * @author Vladislav Semenovykh
 */
public class Item {
    private String description;
    private double price;

    /**
     * Constructor - creating a new instance with specific values
     */
    public Item(String description, double price) {
        this.description = description;
        this.price = price;
    }

    /**
     * String representation instance this class
     * @return "Item = [name = #name, salary = #salary]"
     */
    @Override
    public String toString() {
        return "Item{" +
                "description='" + description + '\'' +
                ", price=" + price +
                '}';
    }

    /**
     * Method is compare this instance with Object o
     * @param o
     * @return true if this instance == Object o, otherwise false
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || !(o instanceof Item)) return false;
        Item item = (Item) o;
        return Double.compare(item.price, price) == 0 &&
                Objects.equals(description, item.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(description, price);
    }
}

package ru.ncedu.horstmann.inheritanceandreflection.item;

import java.util.Objects;

/**
 * This class DiscountedItem
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
public class DiscountedItem extends Item {
    private double discount;

    /**
     * Constructor - creating a new instance with specific values
     */
    public DiscountedItem(String description, double price, double discount) {
        super(description, price);
        this.discount = discount;
    }

    /**
     * Method is compare this instance with Object o
     * @param o
     * @return true if this instance == Object o, otherwise false
     */
    @Override
    public boolean equals(Object o) {
        if (!super.equals(o)) return false;
        if (o.getClass() == Item.class) {
            return true;
        }
        DiscountedItem that = (DiscountedItem) o;
        return Double.compare(that.discount, discount) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), discount);
    }
}

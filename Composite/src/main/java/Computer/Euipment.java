package Computer;

import pattern.Component;

import java.util.Iterator;

/**
 * this interface play as Component role
 */
public interface Euipment {

    /**
     * leaf only return its own price; composite return all leafs total price
     *
     * @return price
     */
    public int netPrice();

    /**
     * only composite need implement
     *
     * @param component
     */
    default void add(Euipment component) {

    }

    /**
     * only composite need implement
     *
     * @param component
     */
    default void remove(Euipment component) {

    }

    /**
     * only composite need implement
     *
     * @param i
     * @return
     */
    default Euipment getChild(int i) {
        return null;
    }

    /**
     * only composite need implement
     *
     * @return Iterator
     */
    default Iterator createIterator() {
        return null;
    }

}

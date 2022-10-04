package org.example.decorator;

public interface Component {

    /**
     * both composite and leaf will implement
     */
    void operation();

    /**
     * only composite need implement
     *
     * @param component
     */
    default void add(Component component) {

    }

    /**
     * only composite need implement
     *
     * @param component
     */
    default void remove(Component component) {

    }

    /**
     * only composite need implement
     *
     * @param i
     * @return
     */
    default Component getChild(int i) {
        return null;
    }

}
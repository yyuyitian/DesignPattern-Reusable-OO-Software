package org.example.editor;

import org.example.decorator.Component;
import org.example.factory.Window;

/**
 * work as component
 */
public interface Glyph {
    /**
     * both composite and leaf will implement
     */
    void draw(Window window);

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

package org.example.editor;

import org.example.factory.Window;

public class Rectangle implements Glyph {

    @Override
    public void draw(Window window) {
        window.drawRect();
    }
}

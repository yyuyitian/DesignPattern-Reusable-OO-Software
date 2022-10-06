package org.example.editor;

import org.example.factory.Window;

public class Row implements Glyph{

    @Override
    public void draw(Window window) {
        window.drawRow();
    }
}

package org.example.editor;

import org.example.factory.Window;
import org.example.factory.WindowImp;

public class Rectangle implements Glyph {

    @Override
    public void draw(Window window) {
        window.drawRect();
    }

    // write for compare with draw(Window window)
    public void draw(WindowImp windowImp) {
        windowImp.deviceRect();
    }
}

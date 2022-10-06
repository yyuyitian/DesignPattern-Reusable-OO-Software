package org.example.editor;

import org.example.factory.Window;
import org.example.command.*;

public abstract class MenuItem implements Glyph{

    public void draw(Window window) {
        System.out.println("draw menuItem");
    }

    public abstract void click();
}

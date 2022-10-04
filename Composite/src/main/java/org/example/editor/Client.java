package org.example.editor;

import org.example.factory.Window;

public class Client {

    public static void main(String[] args) {
        Window window = new Window("X");
        Rectangle rectangle = new Rectangle();
        rectangle.draw(window);
    }
}

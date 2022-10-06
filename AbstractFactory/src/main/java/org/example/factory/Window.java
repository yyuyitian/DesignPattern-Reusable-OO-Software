package org.example.factory;

public class Window {

    private WindowImp imp;

    public Window(String factory) {
        WindowsSystemFactory windowsSystemFactory = new PMWindowSystemFactory(); // default
        if (factory.equals("PM")) {
            windowsSystemFactory = new PMWindowSystemFactory();
        } else if (factory.equals("X")){
            windowsSystemFactory = new XWindowSystemFactory();
        }
        imp = windowsSystemFactory.createWindowImp();
    }

    public void drawRect() {
        imp.deviceRect();
    };

    public void drawRow() {
        imp.deviceRow();
    }
}

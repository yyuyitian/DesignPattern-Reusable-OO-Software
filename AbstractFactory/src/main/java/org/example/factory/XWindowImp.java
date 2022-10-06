package org.example.factory;

public class XWindowImp extends WindowImp{

    @Override
    public void deviceRect() {
        System.out.println("x window rect");
    }

    @Override
    public void deviceRow() {
        System.out.println("x window row");
    }
}

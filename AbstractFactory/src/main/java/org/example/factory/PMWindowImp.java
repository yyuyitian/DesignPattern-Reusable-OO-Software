package org.example.factory;

public class PMWindowImp extends WindowImp{

    @Override
    public void deviceRect() {
        System.out.println("pm window rect");
    }

    @Override
    public void deviceRow() {
        System.out.println("pm window row");
    }
}

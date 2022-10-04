package org.example.factory;

public class XWindowSystemFactory extends WindowsSystemFactory{

    @Override
    public WindowImp createWindowImp() {
        return new XWindowImp();
    }
}

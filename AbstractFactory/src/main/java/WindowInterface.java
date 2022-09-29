public abstract class WindowInterface {

    private WindowImp imp;

    public WindowInterface() {
        WindowsSystemFactory factory = new PMWindowSystemFactory();
        imp = factory.createWindowImp();
    }

    public void drawRect() {
        imp.deviceRect();
    };
}

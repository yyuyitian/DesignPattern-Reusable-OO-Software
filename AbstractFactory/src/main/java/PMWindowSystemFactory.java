public class PMWindowSystemFactory extends WindowsSystemFactory{

    @Override
    public WindowImp createWindowImp() {
        return new PMWindowImp();
    }
}

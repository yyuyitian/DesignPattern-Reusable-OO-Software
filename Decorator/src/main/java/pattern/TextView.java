package pattern;


/**
 * work as ConcreteComponent
 */
public class TextView implements VisualComponent{

    private int id;

    public TextView() {
        id ++;
    }

    @Override
    public void draw() {
        System.out.println("show text box: " + id);
    }

    @Override
    public void resize() {

    }
}

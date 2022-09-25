package pattern;


/**
 * work as ConcreteDecorator
 */
public class BorderDecorator extends Decorator{

    public BorderDecorator() {
        super();
    }

    public BorderDecorator(VisualComponent component, int borderWidth) {
        super(component);
        this.borderWidth = borderWidth;
    }

    /**
     * work as addedBehavior
     * @param borderWidth
     */
    private void drawBorder(int borderWidth) {
        System.out.println("draw border with: " + borderWidth);
    }

    private int borderWidth;

    @Override
    public void draw() {
        super.draw();
        drawBorder(borderWidth);
    }
}

package pattern;

<<<<<<< HEAD
=======
/**
 * work as ConcreteDecorator
 */
>>>>>>> 72deacd (first commit)
public class BorderDecorator extends Decorator{

    public BorderDecorator() {
        super();
    }

    public BorderDecorator(VisualComponent component, int borderWidth) {
        super(component);
        this.borderWidth = borderWidth;
    }

<<<<<<< HEAD
=======
    /**
     * work as addedBehavior
     * @param borderWidth
     */
>>>>>>> 72deacd (first commit)
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

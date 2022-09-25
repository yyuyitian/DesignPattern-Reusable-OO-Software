package pattern;

<<<<<<< HEAD
=======
/**
 * work as ConcreteDecorator
 */
>>>>>>> 72deacd (first commit)
public class ScrollDecorator extends Decorator{

    public ScrollDecorator(VisualComponent component) {
        super(component);
    }

    @Override
    public void draw() {
        super.draw();
        drawScroll();
    }

<<<<<<< HEAD
=======
    /**
     * work as addedBehavior
     */
>>>>>>> 72deacd (first commit)
    private void drawScroll() {
        System.out.println("draw scroll");
    }
}

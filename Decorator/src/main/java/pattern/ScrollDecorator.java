package pattern;

/**
 * work as ConcreteDecorator
 */
public class ScrollDecorator extends Decorator{

    public ScrollDecorator(VisualComponent component) {
        super(component);
    }

    @Override
    public void draw() {
        super.draw();
        drawScroll();
    }

    /**
     * work as addedBehavior
     */
    private void drawScroll() {
        System.out.println("draw scroll");
    }
}

package org.example.decorator;

/**
 * work as Decorator
 */
public class Decorator implements VisualComponent{

    private VisualComponent component;

    public Decorator(VisualComponent component) {
        this.component = component;
    }

    public Decorator() {

    }

    /**
     * 将请求转发给component
     */
    @Override
    public void draw() {
        component.draw();
    }

    @Override
    public void resize() {

    }


}

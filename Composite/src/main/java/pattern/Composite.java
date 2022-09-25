package pattern;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Component{

    List<Component> componentList;

    public Composite() {
        componentList = new ArrayList<>();
    }

    @Override
    public void operation() {

    }

    @Override
    public void add(Component component) {
        if (component != null) {
            componentList.add(component);
        }
    }

    @Override
    public void remove(Component component) {
        if (component != null) {
            componentList.remove(component);
        }
    }

    @Override
    public Component getChild(int i) {
        if (i < componentList.size()) {
            return componentList.get(i);
        }
        return null;
    }
}

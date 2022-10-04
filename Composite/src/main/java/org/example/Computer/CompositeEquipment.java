package org.example.Computer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * it takes the role of composite
 */
public class CompositeEquipment implements Euipment{

    List<Euipment> componentList;

    public CompositeEquipment() {
        componentList = new ArrayList<>();
    }

    @Override
    public int netPrice() {
        Iterator<Euipment> it = createIterator();
        int total = 0;
        while (it.hasNext()) {
            total += it.next().netPrice();
        }
        return total;
    }

    @Override
    public void add(Euipment component) {
        if (component != null) {
            componentList.add(component);
        }
    }

    @Override
    public void remove(Euipment component) {
        if (component != null) {
            componentList.remove(component);
        }
    }

    @Override
    public Euipment getChild(int i) {
        if (i < componentList.size()) {
            return componentList.get(i);
        }
        return null;
    }

    @Override
    public Iterator<Euipment> createIterator() {
        return componentList.iterator();
    }
}

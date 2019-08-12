package main.java.ru.ipolynkina.structural.composite.shape;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Shape {

    private List<Shape> components = new ArrayList<Shape>();

    public void addComponent(Shape shape) {
        components.add(shape);
    }

    public void removeComponent(Shape shape) {
        if(components.contains(shape)) {
            int index = components.indexOf(shape);
            components.remove(index);
        }
    }

    @Override
    public void draw() {
        for(Shape component : components) {
            component.draw();
        }
    }
}

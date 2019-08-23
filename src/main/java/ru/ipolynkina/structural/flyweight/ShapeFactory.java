package main.java.ru.ipolynkina.structural.flyweight;

import main.java.ru.ipolynkina.structural.flyweight.shape.Circle;
import main.java.ru.ipolynkina.structural.flyweight.shape.Point;
import main.java.ru.ipolynkina.structural.flyweight.shape.Shape;
import main.java.ru.ipolynkina.structural.flyweight.shape.Square;

import java.util.HashMap;
import java.util.Map;

public class ShapeFactory {

    private final Map<String, Shape> shapes = new HashMap<>();

    public ShapeFactory() {
        shapes.put("point", new Point());
        shapes.put("circle", new Circle());
        shapes.put("square", new Square());
    }

    public Shape getShape(String shapeName) {
        return (shapes.containsKey(shapeName)) ? shapes.get(shapeName) : shapes.get("point");
    }
}

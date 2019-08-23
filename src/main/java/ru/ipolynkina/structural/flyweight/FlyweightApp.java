package main.java.ru.ipolynkina.structural.flyweight;

import main.java.ru.ipolynkina.structural.flyweight.shape.Shape;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class FlyweightApp {
    public static void main(String[] args) {

        ShapeFactory factory = new ShapeFactory();

        List<Shape> shapes = new ArrayList<>();
        shapes.add(factory.getShape("point"));
        shapes.add(factory.getShape("circle"));
        shapes.add(factory.getShape("square"));
        shapes.add(factory.getShape("magic figure"));

        Random random = new Random();
        for(Shape shape : shapes) {
            int x = random.nextInt(10);
            int y = random.nextInt(25);
            shape.draw(x, y);
        }
    }
}

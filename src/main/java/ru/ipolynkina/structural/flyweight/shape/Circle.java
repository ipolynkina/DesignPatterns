package main.java.ru.ipolynkina.structural.flyweight.shape;

public class Circle implements Shape {

    private int radius;

    public Circle() {
        radius = 5;
    }

    @Override
    public void draw(int x, int y) {
        System.out.println("circle: " + " x = " + x + ", y = " + y + ", radius = " + radius);
    }
}

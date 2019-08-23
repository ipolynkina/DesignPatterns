package main.java.ru.ipolynkina.structural.flyweight.shape;

public class Point implements Shape {

    @Override
    public void draw(int x, int y) {
        System.out.println("point: " + " x = " + x + ", y = " + y);
    }
}

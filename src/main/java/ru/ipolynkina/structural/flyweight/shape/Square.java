package main.java.ru.ipolynkina.structural.flyweight.shape;

public class Square implements Shape {

    private int side;

    public Square() {
        side = 10;
    }

    @Override
    public void draw(int x, int y) {
        System.out.println("square: " + " x = " + x + ", y = " + y + ", side = " + side);
    }
}

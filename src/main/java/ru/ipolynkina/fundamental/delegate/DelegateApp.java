package main.java.ru.ipolynkina.fundamental.delegate;

public class DelegateApp {
    public static void main(String[] args) {

        Pointer pointer = new Pointer(new Square());
        pointer.draw();

        pointer.setGraphics(new Circle());
        pointer.draw();

        pointer.setGraphics(new Triangle());
        pointer.draw();
    }
}

package main.java.ru.ipolynkina.abstractFactory.mouse;

public class EnMouse implements Mouse {
    @Override
    public void click() {
        System.out.println("Click");
    }

    @Override
    public void doubleClick() {
        System.out.println("Double click");
    }

    @Override
    public void scroll() {
        System.out.println("Scroll");
    }
}

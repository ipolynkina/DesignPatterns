package main.java.ru.ipolynkina.creational.abstractFactory.mouse;

public class RuMouse implements Mouse {
    @Override
    public void click() {
        System.out.println("Клик");
    }

    @Override
    public void doubleClick() {
        System.out.println("Двойной клик");
    }

    @Override
    public void scroll() {
        System.out.println("Скролл");
    }
}

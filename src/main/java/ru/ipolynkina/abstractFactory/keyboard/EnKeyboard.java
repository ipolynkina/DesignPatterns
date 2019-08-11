package main.java.ru.ipolynkina.abstractFactory.keyboard;

public class EnKeyboard implements Keyboard {
    @Override
    public void print() {
        System.out.println("Print");
    }

    @Override
    public void println() {
        System.out.println("Println");
    }
}

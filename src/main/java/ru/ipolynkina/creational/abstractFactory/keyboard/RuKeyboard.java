package main.java.ru.ipolynkina.creational.abstractFactory.keyboard;

public class RuKeyboard implements Keyboard {
    @Override
    public void print() {
        System.out.println("Печать");
    }

    @Override
    public void println() {
        System.out.println("Печать с переводом строки");
    }
}

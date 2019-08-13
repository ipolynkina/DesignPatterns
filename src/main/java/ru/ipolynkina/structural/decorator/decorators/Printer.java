package main.java.ru.ipolynkina.structural.decorator.decorators;

public class Printer implements PrinterInterface {

    private String text;

    public Printer(String text) {
        this.text = text;
    }

    @Override
    public void print() {
        System.out.print(text);
    }
}

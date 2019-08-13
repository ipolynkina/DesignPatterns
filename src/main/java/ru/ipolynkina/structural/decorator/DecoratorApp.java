package main.java.ru.ipolynkina.structural.decorator;

import main.java.ru.ipolynkina.structural.decorator.decorators.BracketDecorator;
import main.java.ru.ipolynkina.structural.decorator.decorators.Printer;
import main.java.ru.ipolynkina.structural.decorator.decorators.PrinterInterface;
import main.java.ru.ipolynkina.structural.decorator.decorators.QuotesDecorator;

public class DecoratorApp {
    public static void main(String[] args) {

        PrinterInterface printer = new Printer("Hello");
        printer.print();
        System.out.println();

        printer = new BracketDecorator(new QuotesDecorator(new Printer("Hello")));
        printer.print();
        System.out.println();
    }
}

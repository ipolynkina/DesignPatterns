package main.java.ru.ipolynkina.structural.decorator.decorators;

public class BracketDecorator extends Decorator {

    public BracketDecorator(PrinterInterface component) {
        super(component);
    }

    @Override
    public void print() {
        System.out.print("(");
        super.print();
        System.out.print(")");
    }
}

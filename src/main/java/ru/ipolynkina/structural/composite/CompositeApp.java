package main.java.ru.ipolynkina.structural.composite;

import main.java.ru.ipolynkina.structural.composite.shape.*;

public class CompositeApp {
    public static void main(String[] args) {

        Square square = new Square();
        Circle circle = new Circle();
        Triangle triangle = new Triangle();

        Composite innerComposite = new Composite();
        innerComposite.addComponent(new Triangle());
        innerComposite.addComponent(new Triangle());

        Composite composite = new Composite();
        composite.addComponent(square);
        composite.addComponent(circle);
        composite.addComponent(triangle);
        composite.addComponent(innerComposite);
        composite.draw();

        System.out.println(" * * * ");
        composite.removeComponent(triangle);
        composite.draw();
    }
}

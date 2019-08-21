package main.java.ru.ipolynkina.behavioral.visitor;

import main.java.ru.ipolynkina.behavioral.visitor.elements.BodyElement;
import main.java.ru.ipolynkina.behavioral.visitor.elements.Element;
import main.java.ru.ipolynkina.behavioral.visitor.elements.EngineElement;
import main.java.ru.ipolynkina.behavioral.visitor.visitors.OffVisitor;
import main.java.ru.ipolynkina.behavioral.visitor.visitors.OnVisitor;
import main.java.ru.ipolynkina.behavioral.visitor.visitors.Visitor;

public class VisitorApp {
    public static void main(String[] args) {

        Element engine = new EngineElement();
        Element body = new BodyElement();

        Visitor visitor = new OnVisitor();
        engine.accept(visitor);
        body.accept(visitor);

        visitor = new OffVisitor();
        body.accept(visitor);
        engine.accept(visitor);
    }
}

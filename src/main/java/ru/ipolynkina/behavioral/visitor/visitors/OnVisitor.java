package main.java.ru.ipolynkina.behavioral.visitor.visitors;

import main.java.ru.ipolynkina.behavioral.visitor.elements.BodyElement;
import main.java.ru.ipolynkina.behavioral.visitor.elements.EngineElement;

public class OnVisitor implements Visitor {

    @Override
    public void visit(EngineElement engine) {
        System.out.println("Engine on");
    }

    @Override
    public void visit(BodyElement body) {
        System.out.println("Body open");
    }
}

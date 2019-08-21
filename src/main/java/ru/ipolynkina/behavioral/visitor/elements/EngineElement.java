package main.java.ru.ipolynkina.behavioral.visitor.elements;

import main.java.ru.ipolynkina.behavioral.visitor.visitors.Visitor;

public class EngineElement implements Element {

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}

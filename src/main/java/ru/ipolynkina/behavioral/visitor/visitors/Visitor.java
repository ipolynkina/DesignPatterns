package main.java.ru.ipolynkina.behavioral.visitor.visitors;

import main.java.ru.ipolynkina.behavioral.visitor.elements.BodyElement;
import main.java.ru.ipolynkina.behavioral.visitor.elements.EngineElement;

public interface Visitor {

    void visit(EngineElement engine);
    void visit(BodyElement body);
}

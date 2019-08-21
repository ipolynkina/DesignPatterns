package main.java.ru.ipolynkina.behavioral.visitor.elements;

import main.java.ru.ipolynkina.behavioral.visitor.visitors.Visitor;

public interface Element {

    void accept(Visitor visitor);
}

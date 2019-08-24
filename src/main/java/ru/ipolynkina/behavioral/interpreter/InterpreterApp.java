package main.java.ru.ipolynkina.behavioral.interpreter;

import main.java.ru.ipolynkina.behavioral.interpreter.expression.Expression;

public class InterpreterApp {
    public static void main(String[] args) {

        Context context = new Context();
        Expression expression = context.evaluate("123-23+35-35");
        System.out.println(expression.interpret());
    }
}

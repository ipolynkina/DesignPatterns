package main.java.ru.ipolynkina.behavioral.interpreter;

import main.java.ru.ipolynkina.behavioral.interpreter.expression.Expression;
import main.java.ru.ipolynkina.behavioral.interpreter.expression.MinusExpression;
import main.java.ru.ipolynkina.behavioral.interpreter.expression.NumberExpression;
import main.java.ru.ipolynkina.behavioral.interpreter.expression.PlusExpression;

public class Context {

    public Expression evaluate(String expression) {

        int position = expression.length() - 1;
        while(position > 0) {
            if(Character.isDigit(expression.charAt(position))) {
                position--;
            } else {
                Expression left = evaluate(expression.substring(0, position));
                Expression right = new NumberExpression(Integer.valueOf(
                        expression.substring(position + 1, expression.length())));

                char operator = expression.charAt(position);
                switch(operator) {
                    case '-': return new MinusExpression(left, right);
                    case '+': return new PlusExpression(left, right);
                }
            }
        }
        int result = Integer.valueOf(expression);
        return new NumberExpression(result);
    }
}

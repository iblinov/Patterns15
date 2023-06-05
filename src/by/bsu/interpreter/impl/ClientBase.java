package by.bsu.interpreter.impl;


import by.bsu.interpreter.AbstractMathExpression;
import by.bsu.interpreter.Context;
import by.bsu.interpreter.MathOperation;

import java.util.Arrays;

public class ClientBase {
    private Context context;

    public ClientBase() {
        context = new Context();
    }

    public Double calculate(String expression) {
        Arrays.asList(expression.split("\\p{Space}+")).forEach(token -> {
            AbstractMathExpression action;
            switch (token.charAt(0)) {
                case MathOperation.PLUS:
                    action = c -> c.push(c.pop() + c.pop());
                    break;
                case MathOperation.MINUS:
                    action = c -> {
                        double d1 = c.pop();
                        double d2;
                        if (c.peek() == null) {
                            d2 = 0;
                        } else {
                            d2 = c.pop();
                        }
                        c.push(d2 - d1);
                    };
                    break;
                case MathOperation.MULTIPLY:
                    action = c -> c.push(c.pop() * c.pop());
                    break;
                case MathOperation.DIVIDE:
                    action = c -> {
                        double d1 = c.pop();
                        double d2 = c.pop();
                        c.push(d2 / d1);
                    };
                    break;
                default:
                    action = c -> c.push(Double.valueOf(token));
            }
            action.interpret(context);
        });
        return context.pop();
    }
}

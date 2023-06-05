package by.bsu.interpreter;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PolishNotationParser {// naming ????

    public List<AbstractMathExpression> parse(String polishNotation) {
        List<AbstractMathExpression> expression = new ArrayList<>();
        Arrays.asList(polishNotation.split("\\p{Space}+")).forEach(token -> {
            switch (token.charAt(0)) {
                case MathOperation.PLUS:
                    expression.add(c -> c.push(c.pop() + c.pop()));
                    break;
                case MathOperation.MINUS:
                    expression.add(c -> c.push(-c.pop() + c.pop()));
                    break;
                case MathOperation.MULTIPLY:
                    expression.add(c -> c.push(c.pop() * c.pop()));
                    break;
                case MathOperation.DIVIDE:
                    expression.add(c -> c.push(1 / c.pop() * c.pop()));
                    break;
                default:
                    expression.add(c -> c.push(Double.parseDouble(token)));
            }
        });
        return expression;
    }
}

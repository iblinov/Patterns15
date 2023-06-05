package by.bsu.interpreter;

import java.util.List;

public class InterpreterDemo {
    public static void main(String[] args) {
        String expression = "100 42 2 7 4 + * - /"; // expression in polska form
        PolishNotationParser interpreter = new PolishNotationParser();

        List<AbstractMathExpression> list = interpreter.parse(expression);
        System.out.println(list);
        Client client = new Client();
        Double result = client.handleExpression(list);

        System.out.println("[ " + expression + " ] = " + result);
    }
}

package by.bsu.interpret2;


        import java.util.ArrayDeque;
        import java.util.Arrays;
        import java.util.function.BiFunction;

public class ExpressionInterpreter {

    private void interpret(ArrayDeque<Double> numbers, BiFunction<Double, Double, Double> operation) {
         numbers.push(operation.apply(numbers.pop(), numbers.pop()));
    }

    public Double calculate(String input) {
       ArrayDeque<Double> numbers = new ArrayDeque<>();
        ExpressionConverter expressionConverter = new ExpressionConverter();
        String convertedPolandNotation = expressionConverter.convertToReversePolandNotation(input);
        Arrays.stream(convertedPolandNotation.split(" ")).forEach(number -> {
            switch (number) {
                case "+":
                    interpret(numbers, (n1, n2) -> n2 + n1);
                    break;
                case "-":
                    interpret(numbers, (n1, n2) -> n2 - n1);
                    break;
                case "*":
                    interpret(numbers, (n1, n2) -> n2 * n1);
                    break;
                case "/":
                    interpret(numbers, (n1, n2) -> n2 / n1);
                    break;
                default:
                    numbers.push(Double.parseDouble(number));
            }
        });

        Double result = numbers.pop();

        return result;
    }
}

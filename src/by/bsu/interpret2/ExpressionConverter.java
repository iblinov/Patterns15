package by.bsu.interpret2;



        import java.util.*;

class ExpressionConverter {

    private static final String EXPRESSION_DELIMITER = "(?=\\p{Punct})|(?<=\\p{Punct})";
    private static final int LEFT_ASSOC = 0;
    private static final int RIGHT_ASSOC = 1;
    private static Map<String, int[]> operators = new HashMap<>();

    static {
        operators.put("+", new int[]{0, LEFT_ASSOC});
        operators.put("-", new int[]{0, LEFT_ASSOC});
        operators.put("*", new int[]{1, LEFT_ASSOC});
        operators.put("/", new int[]{1, LEFT_ASSOC});
    }

    private static boolean isDefinedOperator(String token) {
        return operators.containsKey(token);
    }

    private static boolean isAssociative(String token, int type)
            {
        if (!isDefinedOperator(token)) {
        }
        return operators.get(token)[1] == type;
    }

    private static int comparePrecedence(String left, String right)
            {
        if (!isDefinedOperator(left) || !isDefinedOperator(right)) {
        }
        return operators.get(left)[0] - operators.get(right)[0];
    }

    private String buildString(List<String> list) {
        StringBuilder result = new StringBuilder();
        for (String token : list) {
            result.append(token).append(" ");
        }
        String output = result.toString().trim();

       return output;
    }

    String convertToReversePolandNotation(String expression) {
       String[] inputTokens = expression.split(EXPRESSION_DELIMITER);
        ArrayList<String> out = new ArrayList<>();
        ArrayDeque<String> arrayDeque = new ArrayDeque<>();


            for (String token : inputTokens) {
                if (isDefinedOperator(token)) {
                    while (!arrayDeque.isEmpty() && isDefinedOperator(arrayDeque.peek())) {
                        if ((isAssociative(token, LEFT_ASSOC) && comparePrecedence(token, arrayDeque.peek()) <= 0) || (isAssociative(token, RIGHT_ASSOC) && comparePrecedence(token, arrayDeque.peek()) < 0)) {
                            out.add(arrayDeque.pop());
                            continue;
                        }
                        break;
                    }
                    arrayDeque.push(token);
                } else if (token.equals("(")) {
                    arrayDeque.push(token);
                } else if (token.equals(")")) {
                    while (!arrayDeque.isEmpty() && !arrayDeque.peek().equals("(")) {
                        out.add(arrayDeque.pop());
                    }
                    arrayDeque.pop();
                } else {
                    out.add(token);
                }
            }

        while (!arrayDeque.isEmpty()) {
            out.add(arrayDeque.pop());
        }

       return buildString(out);
    }
}

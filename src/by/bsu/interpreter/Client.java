package by.bsu.interpreter;
import java.util.List;

public class Client {
    private Context context = new Context();
    public double handleExpression(List<AbstractMathExpression> expression){
        expression.forEach(o -> o.interpret(context));
//        for (AbstractMathExpression terminal : expression) {
//            terminal.interpret(context);
//        }
        return context.pop();
    }
}

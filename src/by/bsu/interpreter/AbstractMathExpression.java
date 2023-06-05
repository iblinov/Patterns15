package by.bsu.interpreter;

import java.util.function.Consumer;

@FunctionalInterface
public interface AbstractMathExpression {
    void interpret(Context context);
}
class B implements Consumer<Context> {
    @Override
    public void accept(Context context) {

    }
}

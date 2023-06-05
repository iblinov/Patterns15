package by.bsu.interpreter.impl;

public enum MathOperationBase {
    PLUS('+'), MINUS('-'), DIVIDE('/'), MULTIPLY('*');
    private final char operation;
    MathOperationBase(char operation) {
        this.operation = operation;
    }
    public char getOperation() {
        return operation;
    }
}

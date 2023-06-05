package by.compositewar.exception;

public class TroopException extends Exception {
    public TroopException(String message) {
        super(message);
    }

    public TroopException(String message, Throwable cause) {
        super(message, cause);
    }
}


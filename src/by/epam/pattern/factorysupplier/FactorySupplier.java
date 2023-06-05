package by.epam.pattern.factorysupplier;

import java.util.function.Function;
import java.util.function.Supplier;

public class FactorySupplier {
    public static <T, R> Supplier<R> bind(Function<T,R> function, T value) {
        return () -> function.apply(value);
    }
}

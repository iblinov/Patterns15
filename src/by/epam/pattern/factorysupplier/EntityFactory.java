package by.epam.pattern.factorysupplier;

import by.epam.Student;

import java.util.function.Supplier;

public class EntityFactory<T extends Student> {
    T create(Supplier<T> supplier) {

        return supplier.get();
    }
}

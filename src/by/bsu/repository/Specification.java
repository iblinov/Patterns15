package by.bsu.repository;

import by.epam.Student;

import java.util.function.Predicate;
@FunctionalInterface
public interface Specification {
  boolean specify(Student t);
}

package by.bsu.repository;

import by.epam.Student;

import java.util.function.Predicate;

public interface Specification extends Predicate<Student> {
  //boolean specify(T t);
}

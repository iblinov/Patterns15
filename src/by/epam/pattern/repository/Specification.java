package by.epam.pattern.repository;
@FunctionalInterface
public interface Specification<T> {
  boolean specify(T value);
}

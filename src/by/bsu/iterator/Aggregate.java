package by.bsu.iterator;

public interface Aggregate {
	<T> CustomIterator<T> createIterator();
}

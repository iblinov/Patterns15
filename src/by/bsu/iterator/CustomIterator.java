package by.bsu.iterator;

public interface CustomIterator<T> {
	void first();

	void next();

	boolean isDone();

	T currentItem();
}

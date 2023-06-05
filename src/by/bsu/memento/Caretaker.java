package by.bsu.memento;

import java.util.ArrayList;
import java.util.List;

public class Caretaker {
	private List<Memento> mementoList;
	private int currentPosition;
	private boolean hasCached;

	public Caretaker() {
		super();
		mementoList = new ArrayList<>();
		currentPosition = -1;
	}

	public Caretaker(Memento memento) {
		this();
		this.setMemento(memento);
	}

	public void setMemento(Memento memento) {
		currentPosition++;
		if (!hasCached) {
			mementoList.add(memento);
		} else {
			mementoList.set(currentPosition, memento);
			while (mementoList.size() - currentPosition > 1) {
				mementoList.remove(currentPosition + 1);
			}
			hasCached = false;
		}
	}

	public Memento getMemento() {
		return currentPosition >= 0 ? mementoList.get(currentPosition) : null;
	}

	public Memento prevMemento() {
		if (currentPosition >= 1) {
			hasCached = true;
			return mementoList.get(--currentPosition);
		} else {
			return currentPosition == 0 ? mementoList.get(0) : null;
		}
	}

	public Memento nextMemento() {
		if (hasCached) {
			hasCached = !(currentPosition + 2 == mementoList.size());
			return mementoList.get(++currentPosition);
		} else {
			return currentPosition >= 0 ? mementoList
					.get(mementoList.size() - 1) : null;
		}
	}
}

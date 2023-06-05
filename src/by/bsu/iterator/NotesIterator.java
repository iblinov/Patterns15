package by.bsu.iterator;

import java.util.ArrayList;

public class NotesIterator implements CustomIterator<String> {
	private NoteBook iterableNoteBook;
	private ArrayList<String> notesCollection;
	private int current;

	public NotesIterator(NoteBook iterableNoteBook) {
		this.iterableNoteBook = iterableNoteBook;
	}

	@Override
	public void first() {
		notesCollection = new ArrayList<String>(iterableNoteBook.getNotes()
				.values());
	}

	@Override
	public void next() {
		if (!isDone()) {
			current++;
		}
	}

	@Override
	public boolean isDone() {
		return !(current < notesCollection.size());
	}

	@Override
	public String currentItem() {
		return notesCollection.get(current);
	}

}

package by.bsu.iterator;

import java.util.Date;

public class IteratorStart {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		NoteBook notes = new NoteBook("Private Notes");
		notes.addNote(new Date(2015,06,12),"terminate universe");
		notes.addNote(new Date(2014,12,12),"kill everybody");
		notes.addNote(new Date(2015,01,12),"burn everything");
		
		System.out.println("The list of my private notes: ");
		CustomIterator iterator = notes.createIterator();
		while (!iterator.isDone()) {
			System.out.println(iterator.currentItem());
			iterator.next();
		}
	}
}

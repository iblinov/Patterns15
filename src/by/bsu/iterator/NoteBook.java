package by.bsu.iterator;

import java.util.Date;
import java.util.Map;
import java.util.TreeMap;

public class NoteBook implements Aggregate {
	private String title;
	private Map<Date,String> notes = new TreeMap<Date,String>();
	
	public NoteBook(String title){
		this.title = title;
	}
	
	@Override
	public CustomIterator<String> createIterator() {
		CustomIterator<String> iterator = new NotesIterator(this);
		iterator.first();
		return iterator;
	}

	public String getTitle() {
		return title;
	}
	
	public void addNote(String note) {
		notes.put(new Date(), note);
	}
	
	public void addNote(Date date, String note) {
		notes.put(date, note);
	}
	
	public String getNote(Date date) {
		return notes.get(date);
	}
	
	public Map<Date,String> getNotes(){
		return notes;
	}

}

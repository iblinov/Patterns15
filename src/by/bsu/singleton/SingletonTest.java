package by.bsu.singleton;

import java.util.List;
import java.util.Stack;

public class SingletonTest {
	private final static SingletonTest INSTANCE = new SingletonTest();
	private int counter;
	
	private SingletonTest() { 
		counter = 10;
		List list = new Stack();
		list.get(5);
	} // private constructor
	
	public void plus() {
		counter++;
	}
	
	public void minus() {
		counter--;
	}
	
	public int getCount() {
		return counter;
	}
	
	public static SingletonTest getInstance() {		
		return INSTANCE;
	}
}

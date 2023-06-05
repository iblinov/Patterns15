package by.bsu.singleton;

import java.util.List;
import java.util.Stack;

public class SingletonTest2 {
	private int counter;
	
	private SingletonTest2() { 
		counter = 10;
		List list = new Stack();
		list.get(5);
		
	} // private constructor
	
	public void plus() {
		counter++;
	}
	
	public int getCount() {
		return counter;
	}
	
	private static class SingletonHolder { // nested class
		private final static SingletonTest2 INSTANCE = new SingletonTest2();
	}
	public static SingletonTest2 getInstance() {
		return SingletonHolder.INSTANCE;
	}
}

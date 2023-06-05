package by.bsu.singleton;
import java.util.concurrent.locks.ReentrantLock;

public class SingletonTest3 {
	private static SingletonTest3 instance = null;
	private static ReentrantLock lock = new ReentrantLock();
	private int counter;
	private SingletonTest3() { 
		counter = 10;
	} // private constructor
	
	public void plus() {
		counter++;
	}
	
	public int getCount() {
		return counter;
	}
	public static SingletonTest3 getInstance() {	
		lock.lock(); 
		try {
			if (instance == null) {
				Thread.sleep(1000);
				instance = new SingletonTest3();
			}
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			lock.unlock();
		}
		return instance;
	}
}

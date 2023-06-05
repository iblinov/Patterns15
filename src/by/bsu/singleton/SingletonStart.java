package by.bsu.singleton;

public class SingletonStart  {	
	
	public static void main(String[] args) {
		SingletonLoader loader1 = new SingletonLoader();
		SingletonLoader loader2 = new SingletonLoader();
		Thread th1 = new Thread(loader1);
		Thread th2 = new Thread(loader2);
		th1.start();
		th2.start();
	}
}

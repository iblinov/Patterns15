package by.bsu.singleton;

public class SingletonTest4 {
	private static SingletonTest4 instance = null;
	private volatile static boolean instanceCreated = false;
	private int counter;
	private SingletonTest4() { 
		counter = 10;
	} // private constructor
	
	public void plus() {
		counter++;
	}
	
	public int getCount() {
		return counter;
	}
	public static SingletonTest4 getInstance() {
		if (!instanceCreated) {
			try {				
				Thread.sleep(1000);
				synchronized (SingletonTest4.class) {
					try {
						if (!instanceCreated) {
							instance = new SingletonTest4();
							instanceCreated = true;
						}
					} catch (Exception e) {
						System.out.println(e);
					}
				}
			}catch (Exception e) {
				System.out.println(e);
			}
		}
		return instance;
	}
}

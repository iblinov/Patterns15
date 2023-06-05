package by.bsu.singleton;

public class SingletonLoader implements Runnable {
	
	public void run() {
//		test 1
		SingletonTest test = SingletonTest.getInstance();
	   	test.minus();
	   	System.out.println(test.getCount());	   
		
//		test 2
//		SingletonTest2 test = SingletonTest2.getInstance();
//		test.plus();
//	   	System.out.println(test.getCount());	   
	
//	   	test3
//	   	SingletonTest3 test = SingletonTest3.getInstance();
//	   	test.plus();
//	   	System.out.println("Count " + test.getCount());
//	   	try {
//	   		Thread.sleep(1000);
//	   		SingletonLoader loader3 = new SingletonLoader();
//			Thread th3 = new Thread(loader3);
//			th3.start();
//	   	} catch (Exception e) {
//	   		
//	   	}
	   	
	}
}
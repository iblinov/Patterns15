package producer_consumer;

import by.epam.pattern.command.AddCommand;

public class DeadLock {
    static void m1(AddCommand a0, AddCommand b0){
        synchronized (a0) {
            try {
                Thread.sleep(1000);
                System.out.println("a");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (b0) {
                System.out.println("b");
            }
        }
    }

    public static void main(String[] args) {

        AddCommand a = new AddCommand();
        AddCommand b = new AddCommand();
        new Thread(() -> m1 (a, b)).start();
        new Thread(() -> m1 (b, a)).start();

    }
}

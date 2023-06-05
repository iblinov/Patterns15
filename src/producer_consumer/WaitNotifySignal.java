package producer_consumer;
public class WaitNotifySignal {
    private boolean ready;
    private String str;
    public synchronized void consume(){
        while(!ready) {
            try {
                wait();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        ready = false;
    }
    public synchronized void produce(){
        ready = true;
        notify();
    }

    public int length() {
        return str.length();
    }
}

package readwrite;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
class RWDictionary {
    private Map<String, Integer> map = new HashMap<String,Integer>(){{
        this.put("stuff_1",6);
        this.put("stuff_2",16);
    }};
    private final ReentrantReadWriteLock lock = new ReentrantReadWriteLock();
    private final Lock readLock = lock.readLock();
    private final Lock writeLock = lock.writeLock();

//    public int get(String key) {
//        readLock.lock();
//        try { return map.get(key); }
//        finally { readLock.unlock(); }
//    }
    public String allKeys() {
        System.out.println("before read lock:   " + Thread.currentThread().getName());
        readLock.lock();
        try {
            System.out.println("on read 1:   " + Thread.currentThread().getName());
            TimeUnit.MILLISECONDS.sleep(50);

        }catch (InterruptedException e){}
        try {
            StringBuilder str = new StringBuilder();
            for (String i : map.keySet()){
                str.append(i+" "+map.get(i)+"   ");
            }
            try {
                TimeUnit.MILLISECONDS.sleep(50);
                System.out.println("on read 2:   " + Thread.currentThread().getName());
            }catch (InterruptedException e){}
            return str.toString();
        }
        finally { readLock.unlock(); }
    }
    public void put(String key, Integer value) {
        System.out.println("before WRITE lock:   " + Thread.currentThread().getName());
        writeLock.lock();
        try {
            System.out.println("writeLock begin:   " + Thread.currentThread().getName()+ " "+key+" "+value);
            TimeUnit.MILLISECONDS.sleep(20);
            map.put(key, value);
            TimeUnit.MILLISECONDS.sleep(20);
            System.out.println("writeLock end:   " + Thread.currentThread().getName());
        } catch (InterruptedException e){

        }
        finally { writeLock.unlock(); }
    }
    public void clear() {
        writeLock.lock();
        try { map.clear(); }
        finally { writeLock.unlock(); }
    }

    @Override
    public String toString() {
        return "RWDictionary{" +
                "map=" + map +
                '}';
    }
}
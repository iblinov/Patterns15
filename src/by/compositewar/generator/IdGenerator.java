package by.compositewar.generator;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.locks.ReentrantLock;

public class IdGenerator {
    private final static long START_WARRIOR_ID = 1;
    private final static long START_TROOP_ID = 100;

    private static IdGenerator generator;

    private static AtomicBoolean created = new AtomicBoolean();
    private static ReentrantLock lock = new ReentrantLock();

    private AtomicLong manId;
    private AtomicLong busId;

    private IdGenerator() {
        manId = new AtomicLong(START_WARRIOR_ID);
        busId = new AtomicLong(START_TROOP_ID );
    }

    public static IdGenerator getGenerator(){
        if (!created.get()) {
            lock.lock();
            try {
                if (!created.get()) {
                    generator = new IdGenerator();
                    created.set(true);
                }
            } finally {
                lock.unlock();
            }
        }
        return generator;
    }

    public long getWarriorId() {
        return manId.getAndIncrement();
    }

    public long getTroopId() {
        return busId.getAndIncrement();
    }

}

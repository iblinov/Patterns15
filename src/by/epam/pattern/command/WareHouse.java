package by.epam.pattern.command;



import java.util.HashMap;
import java.util.Map;

public class WareHouse {
    private static final WareHouse instance;
    private Map<Integer, ArrayParameters> data = new HashMap<>();
    static {
        instance = new WareHouse();
    }
    private WareHouse() {
    }

    public static WareHouse getInstance() {
        return instance;
    }

    public ArrayParameters get(Integer key) {
        return data.get(key);
    }

    public ArrayParameters put(Integer key, ArrayParameters value) {
        return data.put(key, value);
    }

    public void putAll( Map<? extends Integer, ? extends ArrayParameters> m) {
        data.putAll(m);
    }

    public boolean remove(Object key, Object value) {
        return data.remove(key, value);
    }
}



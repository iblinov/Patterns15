package by.epam.pattern.command;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class RemoveCommand implements Command {
    @Override
    public String execute(Map<String, String> data) {

        WareHouse instance = WareHouse.getInstance();
        Iterator<Map.Entry<String, String>> iterator = data.entrySet().iterator();
        Map.Entry<String, String> entry;
        while (iterator.hasNext()) {
            entry = iterator.next();
            String key = entry.getKey();
     //       instance.remove(key);
        }
        return null;
    }
}

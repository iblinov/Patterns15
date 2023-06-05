package by.epam.pattern.command;

import java.util.Map;

public class AddCommand implements Command{
    @Override
    public String execute(Map<String, String> data) {
        WareHouse wareHouse = WareHouse.getInstance();
      //  wareHouse.putAll(data);
        return null;
    }
}

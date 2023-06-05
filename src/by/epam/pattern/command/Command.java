package by.epam.pattern.command;

import java.util.Map;
@FunctionalInterface
public interface Command {
    String execute(Map<String, String> data);
    default void refresh(){}
}

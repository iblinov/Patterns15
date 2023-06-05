package by.epam.prj.receiver;

import by.epam.prj.command.CommandType;
import by.epam.prj.content.RequestContent;

public interface Receiver {
    default void action(CommandType type, RequestContent content) {
        type.doReceiver(content);
    }
}

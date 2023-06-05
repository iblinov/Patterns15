package by.epam.prj.factory;


import by.epam.pattern.command.AddCommand;
import by.epam.prj.command.AbstractCommand;
import by.epam.prj.command.CommandType;
import by.epam.prj.content.RequestContent;

public class CommandFactoryClient { //  FactoryMethod
    public AbstractCommand initCommand(RequestContent content) {
        AbstractCommand command = null;
        try {
            String commandName = content.getRequestParameters().get("command");
            CommandType type = CommandType.valueOf(commandName.toUpperCase());
            command = type.getCommand();
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
        return command;
    }

}

package by.bsu.commandfunctional.client;

import by.bsu.commandfunctional.command.Command;
import by.bsu.commandfunctional.command.CommandFactory;
import by.bsu.commandfunctional.content.CommandResult;
import by.bsu.commandfunctional.content.RequestContent;

public class Client {
    public void executeCommand(RequestContent content)  {
        CommandFactory factory = CommandFactory.getInstance();
        Command command = factory.getCommand(content);
        CommandResult result = command.execute(content);
    }
}

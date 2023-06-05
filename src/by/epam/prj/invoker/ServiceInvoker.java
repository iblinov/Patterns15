package by.epam.prj.invoker;

import by.epam.prj.command.AbstractCommand;
import by.epam.prj.content.RequestContent;
import by.epam.prj.factory.CommandFactoryClient;

public class ServiceInvoker { // servlet
    public void invoke(RequestContent content) {
        AbstractCommand command;
        command = new CommandFactoryClient().initCommand(content);
        command.execute(content);
    }
}

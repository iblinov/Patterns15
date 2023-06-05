package by.bsu.commandsimplest.command;

import by.bsu.commandsimplest.service.BaseService;

public class BlockingCommand implements Command {
    private BaseService receiver = new BaseService();

    public void execute() {
        // receipt (creation) of an account
        receiver.blocking();
    }
}

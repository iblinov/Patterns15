package by.bsu.commandsimplest.command;

import by.bsu.commandsimplest.service.AccountService;

public class WithdrawingCommand implements Command {
    private AccountService receiver = new AccountService();

    public void execute() {
        // receipt (creation) of an account
        receiver.withdrawing();
    }
}

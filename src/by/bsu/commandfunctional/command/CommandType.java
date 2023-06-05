package by.bsu.commandfunctional.command;

import by.bsu.commandfunctional.service.CommonService;
import by.bsu.commandfunctional.service.UserService;

public enum CommandType {

    LOGIN(UserService.getInstance()::login),
    LOGOUT(UserService.getInstance()::logout),
    SHOW(CommonService.getInstance()::show);

    CommandType(Command command) {
        this.command = command;
    }
    private Command command;
    public Command getCommand() {
        return command;
    }

}

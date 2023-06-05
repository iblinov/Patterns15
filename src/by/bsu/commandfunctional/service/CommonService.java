package by.bsu.commandfunctional.service;

import by.bsu.commandfunctional.content.CommandResult;
import by.bsu.commandfunctional.content.RequestContent;
import by.bsu.commandfunctional.content.ResponseType;

public class CommonService {

    private static final CommonService instance = new CommonService();

    public static CommonService getInstance() {
        return instance;
    }

    public CommandResult show(RequestContent content) {
        System.out.println("show");
        return new CommandResult(ResponseType.FORWARD, "all_users.jsp");
    }

}

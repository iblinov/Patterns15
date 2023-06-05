package by.bsu.commandfunctional.service;
import by.bsu.commandfunctional.content.CommandResult;
import by.bsu.commandfunctional.content.RequestContent;
import by.bsu.commandfunctional.content.ResponseType;

public class UserService {

    private static final UserService instance = new UserService();

    public static UserService getInstance() {
        return instance;
    }

    public CommandResult login(RequestContent content) {
       String loginValue = content.get("login1");
       CommandResult result = new CommandResult(ResponseType.FORWARD, "login.jsp");
       if (loginValue.equals("login_value")) {
           System.out.println(loginValue + "is correct");
           result.setPage("main_page.jsp");
       } else {
           System.out.println(loginValue + "is incorrect");
       }
        return result;
    }

    public CommandResult logout(RequestContent content) {
        System.out.println("logout");
        return new CommandResult(ResponseType.REDIRECT, "index.jsp");
    }

}

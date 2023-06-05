package by.bsu.commandfunctional.runner;

import by.bsu.commandfunctional.command.Command;
import by.bsu.commandfunctional.command.CommandFactory;
import by.bsu.commandfunctional.content.CommandResult;
import by.bsu.commandfunctional.content.RequestContent;

import java.util.HashMap;

public final class Runner {
    public static void main(String... args) {
        CommandFactory commandFactory = CommandFactory.getInstance();
        HashMap<String, String> map = new HashMap<>();
        map.put("command", "login");
        map.put("key1", "value1");
        map.put("login1", "login_value_bad");

        RequestContent content = new RequestContent(map);
        Command command = commandFactory.getCommand(content);
        CommandResult res = command.execute(content);
        System.out.println("move to ----> " + res);
    }
}
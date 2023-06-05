package by.bsu.commandfunctional.command;

import by.bsu.commandfunctional.content.RequestContent;

import java.util.Arrays;
import java.util.HashMap;
import java.util.stream.Collectors;

public final class CommandFactory {
    private static final CommandFactory instance = new CommandFactory();
 //   private final HashMap<String, Command> commands;

    private CommandFactory() {
//        commands = new HashMap<>();
//        Arrays.stream(CommandType.values()).forEach(c -> commands.put(c.getName(), c.getCommand()));
    }

    public static CommandFactory getInstance() {
        return instance;
    }

    public Command getCommand(RequestContent content) {
        String name = content.getRequestParameters().get("command");
        CommandType type = CommandType.valueOf(name.toUpperCase());
        return type.getCommand();
    }

//    public String toString() {
//        return "Enabled commands: " + commands.keySet().stream().collect(Collectors.joining(", "));
//    }

}
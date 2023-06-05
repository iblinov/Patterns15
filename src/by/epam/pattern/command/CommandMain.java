package by.epam.pattern.command;

import java.util.Map;
import java.util.Optional;

public class CommandMain {

    public static void main(String[] args) {
        String strCommand = "add";
        Map<String, String> inputData = Map.of();
        Optional<Command> optionalCommand = CommandType.searchCommand(strCommand);
        Command command = optionalCommand.get();
        command.execute(inputData);
    }
}

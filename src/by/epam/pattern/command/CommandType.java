package by.epam.pattern.command;

import java.util.Optional;

public enum CommandType {
    ADD(new AddCommand()),
    REMOVE(new RemoveCommand());

    private Command command;

    CommandType(Command command) {
        this.command = command;
    }

    public static Optional<Command> searchCommand(String cmd) {
        CommandType type = CommandType.valueOf(cmd.toUpperCase());
        return Optional.ofNullable(type.command);
    }
}

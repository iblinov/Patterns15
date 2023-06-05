package by.bsu.commandfunctional.command;

import by.bsu.commandfunctional.content.CommandResult;
import by.bsu.commandfunctional.content.RequestContent;


@FunctionalInterface
public interface Command {
    CommandResult execute(RequestContent content);
}
package by.bsu.commandsimplest.invoker;

import by.bsu.commandsimplest.command.Command;
import by.bsu.commandsimplest.command.CommandMap;

public class InvokerMain {

    public static void main(String[] args) {
        String cmdString = "blocking";
        System.out.println("Refer to command for execution");
        Command command = CommandMap.getInstance().get(cmdString);
        command.execute();
    }
}

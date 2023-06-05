package by.epam.prj.command;

import by.epam.prj.content.RequestContent;
import by.epam.prj.receiver.Receiver;

public class SignInCommand extends AbstractCommand {
    public SignInCommand(Receiver receiver) {
        super(receiver);
    }

    public void execute(RequestContent content) {
        // validating data from a request  Sign In
        System.out.println("in SignIn Command");
        super.execute(content);
        // принятие решения о переходе
    }
}

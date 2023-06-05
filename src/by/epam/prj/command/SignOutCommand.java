package by.epam.prj.command;


import by.epam.prj.content.RequestContent;
import by.epam.prj.receiver.Receiver;

public class SignOutCommand extends AbstractCommand {
    public SignOutCommand(Receiver receiver) {
        super(receiver);
    }

    public void execute(RequestContent content) {
        // validating data from a request  Sign Out
        System.out.println("in SignOut Command");
        super.execute(content);
        // принятие решения о переходе
    }
}

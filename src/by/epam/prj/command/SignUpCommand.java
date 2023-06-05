package by.epam.prj.command;


import by.epam.prj.content.RequestContent;
import by.epam.prj.receiver.Receiver;

public class SignUpCommand extends AbstractCommand {
    public SignUpCommand(Receiver receiver) {
        super(receiver);
    }

    public void execute(RequestContent content) {
        // validating data from a request Sign Up
        System.out.println("in SignUp Command");
        super.execute(content);
        // принятие решения о переходе
        }
}

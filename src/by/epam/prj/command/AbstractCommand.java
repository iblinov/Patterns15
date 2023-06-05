package by.epam.prj.command;

import by.epam.prj.content.RequestContent;
import by.epam.prj.receiver.Receiver;

public  abstract class AbstractCommand {
    private Receiver receiver;

    public AbstractCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    public void execute(RequestContent content){
        receiver.action(CommandType.takeCommandType(this), content);
    }

    public Receiver getReceiver() {
        return receiver;
    }

   }

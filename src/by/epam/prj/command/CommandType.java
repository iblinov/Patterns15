package by.epam.prj.command;


import by.epam.prj.content.RequestContent;
import by.epam.prj.receiver.CommonReceiver;
import by.epam.prj.receiver.CommonReceiverImpl;
import by.epam.prj.receiver.UserReceiverImpl;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public enum CommandType {

    SIGN_IN(new SignInCommand(new UserReceiverImpl())) {
            public void doReceiver(RequestContent content){
            ((UserReceiverImpl) getCommand().getReceiver()).signIn(content);
                // добавление результатов метода signIn в content
        }
    },
    SIGN_UP(new SignUpCommand(new UserReceiverImpl())) {
        public void doReceiver(RequestContent content) {
            ((CommonReceiverImpl) getCommand().getReceiver()).signUp(content);
            // добавление результатов метода signUp в content
        }
    },
    SIGN_OUT(new SignOutCommand(new UserReceiverImpl())) {
        public void doReceiver(RequestContent content) {
            ((UserReceiverImpl) getCommand().getReceiver()).signOut(content);
            // добавление результатов метода signOut в content
        }
    };

    private AbstractCommand command;

    CommandType(AbstractCommand command) {
        this.command = command;

    }
    public AbstractCommand getCommand() {
        return command;
    }

    public abstract void doReceiver(RequestContent content);

    public static CommandType takeCommandType(AbstractCommand command) {
        ArrayList<CommandType> result = new ArrayList<>();
        List<CommandType> types = Arrays.asList(CommandType.values());
        types.stream().filter(t -> t.getCommand()==command).forEach(t -> result.add(t));
        System.out.println(result.size());
        return result.get(0);
    }
}

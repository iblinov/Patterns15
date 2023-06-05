package by.epam.prj.receiver;

import by.epam.prj.content.RequestContent;

/**
 * Created by Ihar_Blinou on 7/13/2017.
 */
public class CommonReceiverImpl implements CommonReceiver {
    @Override
    public void signUp(RequestContent content) {
        System.out.println("SignUp dao");
    }
}

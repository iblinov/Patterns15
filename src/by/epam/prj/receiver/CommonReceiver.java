package by.epam.prj.receiver;

import by.epam.prj.content.RequestContent;

/**
 * Created by Ihar_Blinou on 7/13/2017.
 */
public interface CommonReceiver extends Receiver {

    void signUp(RequestContent content);
}

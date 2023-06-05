package by.epam.prj.receiver;


import by.epam.prj.content.RequestContent;

public interface UserReceiver extends Receiver {

    void signIn(RequestContent content);
    void signOut(RequestContent content);
}

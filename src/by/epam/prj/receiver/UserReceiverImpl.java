package by.epam.prj.receiver;


import by.epam.prj.content.RequestContent;

public class UserReceiverImpl implements UserReceiver {

    @Override
    public void signIn(RequestContent content) {
        System.out.println("SignIn dao");
    }

    @Override
    public void signOut(RequestContent content) {
        System.out.println("SignOut dao");
    }
}

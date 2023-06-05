package by.bsu.chain;

public class AuthenticationHandler extends AbstractHandler {
    private AbstractHandler successor = new SmsHandler();
    @Override
    public String handleRequest() {
        System.out.println("authentication process");
        return successor.handleRequest();
    }
}

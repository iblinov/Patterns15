package by.bsu.chain;

public class SmsHandler extends AbstractHandler {
    private AbstractHandler successor = new BalanceCheckHandler();
    @Override
    public String handleRequest() {
        System.out.println("sms code verification process");
        return successor.handleRequest();
    }
}

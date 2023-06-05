package by.bsu.chain;

public class BalanceCheckHandler extends AbstractHandler {
    private AbstractHandler successor;
    @Override
    public String handleRequest() {
        System.out.println("balance verification process");
        float balance = 42;
        return Float.toString(balance);
    }
}

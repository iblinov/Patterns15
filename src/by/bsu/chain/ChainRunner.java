package by.bsu.chain;

public class ChainRunner {
    public static void main(String[] args) {
        AbstractHandler handler = new AuthenticationHandler();
        System.out.println("Balance = " + handler.handleRequest());
    }
}

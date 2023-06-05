package by.bsu.chainofresponsibility.handler;
import by.bsu.chainofresponsibility.BankAccount;

public class DepositHandler extends AbstractHandler {
    private float amountDeposit;

    public DepositHandler(float amountDeposit) {
        this.amountDeposit = amountDeposit;
    }
    @Override
	public void handleRequest(BankAccount account) {
		account.setBalance(account.getBalance() + amountDeposit);
        System.out.println("deposit: the deposit is credited to the account: +" + amountDeposit);
	}
}
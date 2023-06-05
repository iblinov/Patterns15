package by.bsu.chainofresponsibility.handler;
import by.bsu.chainofresponsibility.BankAccount;

public class AutoPaymentHandler extends AbstractHandler {
	private float amountAutoPayments;

	public AutoPaymentHandler(float amountAutoPayments) {
		this.amountAutoPayments = amountAutoPayments;
	}
	@Override
	public void handleRequest(BankAccount account) {
		float rest = account.getBalance() - amountAutoPayments;
		if (checking(rest)) {
			account.setBalance(rest);
			System.out.println("autoPayment: completed: -" + amountAutoPayments);
		} else {
			System.out.println("autoPayment: failed - insufficient funds");
		}
	}
	private boolean checking(float rest) {
		System.out.println("autoPayment: checking the status of payments");
		// more code
		return rest >= amountAutoPayments;
	}
}

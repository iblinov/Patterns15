package by.bsu.chainofresponsibility.handler;
import by.bsu.chainofresponsibility.BankAccount;

import java.util.Random;

public class CreditPaymentHandler extends AbstractHandler {
	private float percentCreditPayments;
	private float amountCredit = 100;

	public CreditPaymentHandler(float percentCreditPayments) {
		this.percentCreditPayments = percentCreditPayments;
	}
	@Override
	public void handleRequest(BankAccount account) {
		if(checkTerms()) {
			// check of credit balance surplus
			float balance = account.getBalance();
			float loanPayment = amountCredit * percentCreditPayments / 100;
			account.setBalance(balance - loanPayment);
			System.out.println("creditPayment: interest is deducted: -" + loanPayment);
		}
	}
	private boolean checkTerms() {
		boolean flag = false;
		if(new Random().nextBoolean()) {
			System.out.println("creditPayment: interest must be paid");
			flag = true;
		} else {
			System.out.println("creditPayment: interest should not be paid");
		}
		return flag;
	}
}

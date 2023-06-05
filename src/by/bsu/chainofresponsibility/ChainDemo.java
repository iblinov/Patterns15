package by.bsu.chainofresponsibility;

import by.bsu.chainofresponsibility.handler.AutoPaymentHandler;
import by.bsu.chainofresponsibility.handler.CreditPaymentHandler;
import by.bsu.chainofresponsibility.handler.DepositHandler;
import java.util.Random;
public class ChainDemo {
	static public void main(String[] args) {
		float amountAutoPayments = new Random().nextInt(42);
		float percentCreditPayments = 2 + new Random().nextInt(3);
		AutoPaymentHandler autoPaymentHandler = new AutoPaymentHandler(amountAutoPayments);
        CreditPaymentHandler creditPaymentHandler = new CreditPaymentHandler(percentCreditPayments);
        DepositHandler depositHandler = new DepositHandler(42);
        autoPaymentHandler.setNextSuccessor(creditPaymentHandler);
        creditPaymentHandler.setNextSuccessor(depositHandler);
        BankAccount bankAccount = new BankAccount(424242, 100);
        System.out.println(bankAccount);
        autoPaymentHandler.chain(bankAccount);
        System.out.println(bankAccount);
	}
}

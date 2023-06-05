package by.bsu.commandsimplest.service;

import by.bsu.commandsimplest.entity.Account;

public class AccountService {
    private Account account;
    private double amount;
    private static final double INTEREST_RATE = 9.5; // должно быть получено извне
    public void setAccount(Account account) {
        this.account = account;
    }
    public void crediting(){
        if (account.isBlocked()) {
            System.out.println("Sorry, the account #" + account.getId()
                    + " is blocked! You can't credit charges to it");
        }else{
            double balance = account.getBalance();
            balance *= INTEREST_RATE * 0.01;
            account.setBalance(balance);
            System.out.println("Crediting is performed with "
                    + INTEREST_RATE + " % interest rate to the account #"
                    + account.getId());
        }

    }
    public void withdrawing(){
        if (account.isBlocked()) {
            System.out.println("Sorry, the account#" + account.getId()
                    + " is blocked!" + " You can't withdraw money");
        }else{
            double balance=account.getBalance();
            balance-=amount;
            account.setBalance(balance);
            System.out.println(amount
                    +" is withdrawed from the account #"+account.getId());
        }

    }
}

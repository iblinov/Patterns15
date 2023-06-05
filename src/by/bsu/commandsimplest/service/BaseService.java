package by.bsu.commandsimplest.service;

import by.bsu.commandsimplest.entity.Account;

public class BaseService {
    private Account account;

    public void setAccount(Account account) {
        this.account = account;
    }

    public void blocking() {
        if (account.isBlocked()) {
            account.setBlocked(false);
            System.out.println("The account #"+account.getId()
                    +  " is unblocked");
        }else{
            account.setBlocked(true);
            System.out.println("The account #"+account.getId()
                    +" is blocked");
        }

    }
}

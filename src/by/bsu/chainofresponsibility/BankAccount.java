package by.bsu.chainofresponsibility;

public class BankAccount {
    private long accountId;
    private float balance;// - > BigDecimal
    public BankAccount(long accountId, float balance) {
        this.accountId = accountId;
        this.balance = balance;
    }
    public long getAccountId() {
        return accountId;
    }
    public void setAccountId(long accountId) {
        this.accountId = accountId;
    }

    public float getBalance() {
        return balance;
    }
    public void setBalance(float balance) {
        this.balance = balance;
    }
    @Override
    public String toString() {
        return "BankAccount{accountId=" + accountId +
                ", balance=" + balance + '}';
    }
}

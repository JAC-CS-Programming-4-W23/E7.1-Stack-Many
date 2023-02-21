package ca.qc.johnabbott.cs4p6;

public class Account {

    private long accountId;

    private String name;

    private long cardId;
    private long pin;

    private double balance;

    // TODO think about limit private double limit;

    public Account(long accountId, String name, long cardId, long pin, double balance) {
        this.accountId = accountId;
        this.name = name;
        this.cardId = cardId;
        this.pin = pin;
        this.balance = balance;
    }

    public long getAccountId() {
        return accountId;
    }

    public void setAccountId(long accountId) {
        this.accountId = accountId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getCardId() {
        return cardId;
    }

    public void setCardId(long cardId) {
        this.cardId = cardId;
    }

    public long getPin() {
        return pin;
    }

    public void setPin(long pin) {
        this.pin = pin;
    }

    public double getBalance() {
        return balance;
    }

    public void withdraw(double amount) {
        if (amount < 0)
            throw new IllegalArgumentException();
        if (amount > balance)
            throw new RuntimeException("Insufficient funds.");
        balance -= amount;
    }

    public void deposit(double amount) {
        if (amount < 0)
            throw new IllegalArgumentException();
        balance += amount;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountId=" + accountId +
                ", name='" + name + '\'' +
                ", cardId=" + cardId +
                ", pin=" + pin +
                ", balance=" + balance +
                '}';
    }
}

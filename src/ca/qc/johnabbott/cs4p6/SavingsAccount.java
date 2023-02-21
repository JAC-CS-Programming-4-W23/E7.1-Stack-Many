package ca.qc.johnabbott.cs4p6;

public class SavingsAccount extends Account {

    private double rate;

    public SavingsAccount(long accountId, String name, long cardId, long pin, double balance, double rate) {
        super(accountId, name, cardId, pin, balance); // call super-class constructor
        this.rate = rate;
    }

    public void apply() {
         deposit(getBalance() * rate);
    }

}

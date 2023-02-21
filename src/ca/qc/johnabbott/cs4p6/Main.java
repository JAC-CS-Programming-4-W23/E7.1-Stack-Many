package ca.qc.johnabbott.cs4p6;

public class Main {

    public static void main(String[] args) {

        Account account = new Account(123, "Ian", 456, 1234, 500.0);
        account.deposit(123);
        account.withdraw(100);
        account.toString();
        //account.rate();

//        SavingsAccount savings = new SavingsAccount(124, "Flynn", 345, 1232, 1000.0);
//        savings.deposit(100);
//        savings.withdraw(50);
//        savings.apply();

    }
}

package bank;

import main.Person;

public class BankAccount {
    private double balance;
    private final Person owner;

    public BankAccount(Person owner, double initialDeposit) {
        this.owner = owner;
        this.balance = initialDeposit;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public boolean withdraw(double amount) {
        if (balance >= amount) {
            balance = balance - amount;
            return true;
        }
        return false;
    }
}

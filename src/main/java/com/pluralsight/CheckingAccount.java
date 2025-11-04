package com.pluralsight;

public class CheckingAccount extends Account{
    public CheckingAccount(String name, String accountNumber, double balance) {
        super(name, accountNumber, balance);
    }

    public void deposit(double amount) {
        if (amount > 0) {
            super.setBalance(super.getBalance() + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    public double withdraw(double amount) {
        double balance = super.getBalance();
        if (amount > 0 && amount <= balance) {
            super.setBalance(balance - amount);
            return amount;
        } else {
            System.out.println("Insufficient funds or invalid withdrawal amount.");
            return 0;
        }
    }

    @Override
    public double getValue() {
        return super.getBalance();
    }
}

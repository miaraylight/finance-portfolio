package com.pluralsight;

public class CheckingAccount extends Account{
    public CheckingAccount(String name, String accountNumber, double balance) {
        super(name, accountNumber, balance);
    }

    public void deposit(double amount) {
        System.out.println(amount);
    }

    public double withdraw(double amount) {
        return 0;
    }


    @Override
    public double getValue() {
        return 0;
    }
}

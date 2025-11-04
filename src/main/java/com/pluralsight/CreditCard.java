package com.pluralsight;

public class CreditCard extends Account{
    public CreditCard(String name, String accountNumber, double balance) {
        super(name, accountNumber, balance);
    }

    public void charge(double amount) {
        System.out.println("CC charge for: " + amount);
    }

    public void pay(double amount) {
        System.out.println("Paid");
    }

    @Override
    public double getValue() {
        return 0;
    }
}

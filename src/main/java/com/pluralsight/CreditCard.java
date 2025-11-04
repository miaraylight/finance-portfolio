package com.pluralsight;

public class CreditCard extends Account{
    public CreditCard(String name, String accountNumber, double balance) {
        super(name, accountNumber, balance);
    }

    public void charge(double amount) {
        if (amount > 0) {
            super.setBalance(super.getBalance() + amount);
            System.out.println("Charged $" + amount + " to credit card.");
        } else {
            System.out.println("Charge amount must be positive.");
        }
    }

    public void pay(double amount) {
        if (amount > 0) {
            double newBalance = super.getBalance() - amount;
            if (newBalance < 0) {
                newBalance = 0; // no negative balances (fully paid off)
            }
            super.setBalance(newBalance);
            System.out.println("Payment of $" + amount + " made.");
        } else {
            System.out.println("Payment amount must be positive.");
        }
    }

    // The value here can represent the outstanding debt (negative asset)
    @Override
    public double getValue() {
        return -super.getBalance(); // debt reduces your total net worth
    }
}

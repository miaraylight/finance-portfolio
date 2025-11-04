package com.pluralsight;

public class FinanceApplication {
    public static void main(String[] args) {
        Portfolio p = new Portfolio("My Portfolio", "Mia");

        p.add(new CheckingAccount("Main Account", "CHK-01", 500));
        p.add(new CreditCard("Visa", "CC-01", 300)); // owes $300
        p.add(new Gold("Gold Bar", 65.5, 1000));
        p.add(new House("Lake House", 300000, 1999, 5000, 4));
        p.add(new Jewelry("Ring", 10000, 3));

        System.out.println("Net Portfolio Value: $" + p.getValue());
        System.out.println("Most Valuable: " + p.getMostValuable().getClass().getSimpleName() + " with value: " + p.getMostValuable().getValue());
        System.out.println("Least Valuable: " + p.getLeastValuable().getClass().getSimpleName() + " with value: " + p.getLeastValuable().getValue());
    }
}

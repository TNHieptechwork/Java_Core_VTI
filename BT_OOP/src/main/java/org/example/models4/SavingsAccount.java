package org.example.models4;

public class SavingsAccount extends BankAccount{
    private double interestRate;

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public SavingsAccount(String accountNumber, String ownerName, double balance, double interestRate) {
        super(accountNumber, ownerName, balance);
    }

    @Override
    public double calculateInterest() {
        return interestRate * getBalance();
    }
}

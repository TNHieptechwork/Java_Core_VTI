package org.example.models4;

public class CheckingAccount extends BankAccount{
    private double withdrawLimit;

    public CheckingAccount(String accountNumber, String ownerName, double balance, double withdrawLimit) {
        super(accountNumber, ownerName, balance);
        this.withdrawLimit = withdrawLimit;
    }

    public double getWithdrawLimit() {
        return withdrawLimit;
    }

    public void setWithdrawLimit(double withdrawLimit) {
        this.withdrawLimit = withdrawLimit;
    }

    @Override
    public void withdraw(double amount) {
        if(amount <= withdrawLimit){
            System.out.println("Amount must <= withdrawLimit");
        }else{
            super.withdraw(amount);
        }
    }

    @Override
    public double calculateInterest() {
        return 0;
    }
}

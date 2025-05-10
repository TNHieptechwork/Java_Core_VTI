package org.example.models4;

public abstract class BankAccount {
    private String accountNumber;
    private String ownerName;
    private double balance;

    public abstract double calculateInterest();

    public  void display(){
        System.out.println("Account Number: " + accountNumber);
        System.out.println("\nOwner Name: " + ownerName);
        System.out.println("\nBalance: " + balance);
    }

    public void deposit(double amount){
        if(amount > 0){
            this.balance += amount;
            System.out.println("Deposited: " + amount +" by " + this.getAccountNumber());
        }
        else{
            System.out.println("Invalid deposit amount");
        }
    }

    public void withdraw(double amount){
        if(amount > 0 && amount <= this.balance){
            this.balance -= amount;
            System.out.println("Withdrawn: " + amount + " by " + this.getAccountNumber());
        }
        else{
            System.out.println("Invalid deposit amount");
        }
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public BankAccount(String accountNumber, String ownerName, double balance) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.balance = balance;
    }
}

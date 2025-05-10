package org.example.models4;

import java.util.*;

public class Bank {
    private Map<String,BankAccount> bankAccountList;

    public Bank(Map<String, BankAccount> bankAccountList) {
        this.bankAccountList = bankAccountList;
    }

    public void addBankAccount(BankAccount b){
        bankAccountList.put(b.getAccountNumber(),b);
        System.out.println("Account added: " + b.getAccountNumber() + "\n");
    }
    public void deposit(String accNumber,double amount){
        BankAccount account = findAccount(accNumber);
        if(account != null){
            account.deposit(amount);
            logTransaction("DEPOSIT",accNumber,amount);
            System.out.println("Current Balance: " + account.getBalance() + "\n");
            System.out.println("-----------------\n");
        }
        else{
            System.out.println("Account not found");
        }
    }
    public void withdraw(String accNumber,double amount){
        BankAccount account = findAccount(accNumber);
        if(account != null){
            account.withdraw(amount);
            logTransaction("WITHDRAW",accNumber,amount);
            System.out.println("Current Balance: " + account.getBalance() + "\n");
            System.out.println("-----------------\n");
        }
        else{
            System.out.println("Account not found");
        }
    }

    private void logTransaction(String type,String accNum,double amount) {
        System.out.printf("Type: %s, Account: %s,Amount: %,.2f\n",type,accNum,amount);
        System.out.println();
    }

    public BankAccount findAccount(String account){
        for(BankAccount a : bankAccountList.values()){
            if(a.getAccountNumber().equals(account)){
                return a;
            }
        }
        return  null;
    }
    public double totalAmoutInSys(){
        double total = 0;
        for(BankAccount a : bankAccountList.values()){
            total += a.getBalance();
        }
        return  total;
    }
}

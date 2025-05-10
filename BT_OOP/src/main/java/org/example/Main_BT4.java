package org.example;

import org.example.models4.Bank;
import org.example.models4.CheckingAccount;
import org.example.models4.SavingsAccount;

import java.util.HashMap;

public class Main_BT4 {
    public static void main(String[] args) {
        Bank b = new Bank(new HashMap<>());
        b.addBankAccount(new SavingsAccount("22123451", "Alice", 10000, 0.03));
        b.addBankAccount(new SavingsAccount("10094251", "Bob", 5000, 0.02));
        b.addBankAccount(new CheckingAccount("22173842", "Charlie", 3000, 5000));
        b.addBankAccount(new CheckingAccount("02323245", "David", 7000, 5000));

        System.out.println("-----------------\n");
        b.deposit("22123451",5000);
        b.withdraw("22173842",500);
        b.deposit("02323245", 1000);
        b.withdraw("10094251", 200);


        System.out.println("Total amount in system: " + b.totalAmoutInSys());
        System.out.println("\n-----------------\n");
    }
}

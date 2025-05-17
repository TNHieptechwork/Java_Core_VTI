package org.example.bt3;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        DatabaseConnection db1 = DatabaseConnection.instance;
        DatabaseConnection db2 = DatabaseConnection.instance;

        db1.connect();
        db2.connect();

        db1.disconnect();
        db2.disconnect();
    }
}
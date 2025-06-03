package org.example.SingleTon;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Logger lg1 = Logger.getInstance();
        lg1.log("log message");

        Logger lg2 = Logger.getInstance();
        lg2.log("hello world");

        System.out.println(lg1 == lg2);
    }
}
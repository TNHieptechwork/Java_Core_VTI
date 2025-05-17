package org.example.bt5;

public class SMSNotification implements Notification{
    @Override
    public void send() {
        System.out.println("Send SMS");
    }
}

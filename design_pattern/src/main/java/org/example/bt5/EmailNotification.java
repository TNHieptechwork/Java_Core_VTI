package org.example.bt5;

public class EmailNotification implements Notification{
    @Override
    public void send() {
        System.out.println("Send email");
    }
}

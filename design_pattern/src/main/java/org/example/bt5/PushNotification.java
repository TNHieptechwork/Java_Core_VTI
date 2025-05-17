package org.example.bt5;

public class PushNotification implements Notification{
    @Override
    public void send() {
        System.out.println("Send Push");
    }
}

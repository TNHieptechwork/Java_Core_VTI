package org.example.Decorator_Pattern.BT2;

public class BasicEmailSender implements EmailSender{

    @Override
    public void send(String message) {
        System.out.println("Sending email with content: " + message);
    }
}

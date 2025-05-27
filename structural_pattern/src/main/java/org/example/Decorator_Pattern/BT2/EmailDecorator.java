package org.example.Decorator_Pattern.BT2;

public  abstract class EmailDecorator implements EmailSender {
    protected EmailSender wrappee;

    public EmailDecorator(EmailSender wrappee) {
        this.wrappee = wrappee;
    }

    @Override
    public void send(String message) {
        wrappee.send(message);
    }
}

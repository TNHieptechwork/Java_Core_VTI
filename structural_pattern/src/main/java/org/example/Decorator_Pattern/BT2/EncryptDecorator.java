package org.example.Decorator_Pattern.BT2;

public class EncryptDecorator extends EmailDecorator{
    public EncryptDecorator(EmailSender wrappee) {
        super(wrappee);
    }

    @Override
    public void send(String message) {
        String encrypted = "Encrypted " + message + "\n";
        super.send(encrypted);
    }
}

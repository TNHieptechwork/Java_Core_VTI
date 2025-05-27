package org.example.Decorator_Pattern.BT2;

public class CompressDecorator extends EmailDecorator{
    public CompressDecorator(EmailSender wrappee) {
        super(wrappee);
    }

    @Override
    public void send(String message) {
        String compress = "Compressed " + message + "\n";
        super.send(compress);
    }
}

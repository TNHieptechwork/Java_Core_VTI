package org.example.Decorator_Pattern.BT2;

public class SignDecorator extends EmailDecorator{

    public SignDecorator(EmailSender wrappee) {
        super(wrappee);
    }

    @Override
    public void send(String message) {
        String Sign = " " + message + " Signed \n";
        super.send(Sign);
    }
}

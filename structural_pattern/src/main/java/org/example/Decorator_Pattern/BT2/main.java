package org.example.Decorator_Pattern.BT2;

public class main {
    public static void main(String[] args) {
        EmailSender sender = new BasicEmailSender();

        sender = new EncryptDecorator(sender);
        sender = new CompressDecorator(sender);
        sender = new SignDecorator(sender);

        sender.send("[Contract]");
    }
}

package org.example.bt5;

public class Main {
    public static void main(String[] args) {
        NotificationFactory not = new NotificationFactory();

        Notification e = not.getNotification("EMAIL");
        e.send();

        Notification s = not.getNotification("SMS");
        s.send();

        Notification p = not.getNotification("PUSH");
        p.send();
    }
}

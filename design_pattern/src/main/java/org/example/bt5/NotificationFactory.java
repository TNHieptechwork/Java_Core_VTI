package org.example.bt5;

public class NotificationFactory {
    public Notification getNotification(String typeNot){
        if(typeNot == null) return null;
        if(typeNot.equalsIgnoreCase("EMAIL")){
            return new EmailNotification();
        } else if (typeNot.equalsIgnoreCase("PUSH")) {
            return new PushNotification();
        }
        else if(typeNot.equalsIgnoreCase("SMS")){
            return new SMSNotification();
        }
        return null;
    }
}

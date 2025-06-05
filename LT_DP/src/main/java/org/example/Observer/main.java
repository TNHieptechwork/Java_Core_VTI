package org.example.Observer;

public class main {
    public static void main(String[] args) {
        User us1 = new User("An");
        User us2 = new User("Nam");

        Publisher channel = new Publisher("John offical");
        channel.subscribe(us1);
        channel.subscribe(us2);

        channel.post("welcome to my channel");

        channel.unsubscribe(us1);

        channel.post("Hello world");

    }
}

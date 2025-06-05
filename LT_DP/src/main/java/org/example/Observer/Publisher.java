package org.example.Observer;

import java.util.*;

public class Publisher implements Subject{
    private String name;
    private List<Observer> followers = new ArrayList<>();

    public Publisher(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void subscribe(Observer o) {
        followers.add(o);
        System.out.println(((User) o).getName() + " subscribed " + name);
    }

    @Override
    public void unsubscribe(Observer o) {
        followers.remove(o);
        System.out.println(((User) o).getName() + " unsubscribed " + name);
    }

    @Override
    public void notifyObservers(String postContent) {
        for (Observer o : followers) {
            o.update(postContent, this.name);
        }
    }
    public void post(String content) {
        System.out.println("\n" + name + " đăng bài mới: " + content);
        notifyObservers(content);
    }
}

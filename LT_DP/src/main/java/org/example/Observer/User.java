package org.example.Observer;

public class User implements Observer{
    private String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void update(String postContent, String publisherName) {
        System.out.println(name + " nhận thông báo : " + postContent + " từ " + publisherName);
    }
}

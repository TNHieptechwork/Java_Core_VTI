package org.example.Observer;

import java.util.ArrayList;
import java.util.List;

public class NewsAgency implements Subject{
    private List<Observer> list;

    public NewsAgency() {
        list = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer o) {
        list.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        list.remove(o);
    }

    @Override
    public void notifyObservers(String news) {
        for(Observer o : list){
            o.update(news);
        }
    }
    public void addNews(String news) {
        System.out.println("📰 Tin tức mới: " + news);
        notifyObservers(news);
    }
}

package com.study.demo.designpatterns.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * The type Notice.
 */
public class Notice implements BeObserver {
    private List<Observer> observers = new ArrayList<>();


    @Override
    public List<Observer> getObserverList() {
        return this.observers;
    }

    @Override
    public void addObserver(Observer observer) {
        this.observers.add(observer);
    }

    @Override
    public void delObserver(Observer observer) {
        this.observers.remove(observer);
    }

    @Override
    public void noticeObserver() {
        for (Observer observer: observers) {
            observer.show();
        }
    }

    public void newNoticeCome() {
        noticeObserver();
    }
}

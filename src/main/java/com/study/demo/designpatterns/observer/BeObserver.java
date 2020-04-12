package com.study.demo.designpatterns.observer;

import java.util.List;

public interface BeObserver {
    List<Observer> getObserverList();

    void addObserver(Observer observer);

    void delObserver(Observer observer);

    void noticeObserver();
}

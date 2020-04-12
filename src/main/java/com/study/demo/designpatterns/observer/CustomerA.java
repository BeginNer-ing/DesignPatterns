package com.study.demo.designpatterns.observer;

/**
 * The type Customer a.
 */
public class CustomerA implements Observer {
    @Override
    public void show() {
        System.out.println("A:我收到通知了");
    }
}

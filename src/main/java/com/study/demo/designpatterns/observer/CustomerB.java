package com.study.demo.designpatterns.observer;

/**
 * The type Customer b.
 */
public class CustomerB implements Observer {
    @Override
    public void show() {
        System.out.println("B:我收到通知了");
    }
}

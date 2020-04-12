package com.study.demo.designpatterns.observer;

import java.util.Observable;

/**
 * The type Test notice.
 */
public class TestNotice {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        Notice notice = new Notice();
        Observer customerA = new CustomerA();
        Observer customerB = new CustomerB();

        notice.addObserver(customerA);
        notice.addObserver(customerB);

        notice.newNoticeCome();
    }
}

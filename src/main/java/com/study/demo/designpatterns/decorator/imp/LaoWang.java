package com.study.demo.designpatterns.decorator.imp;

import com.study.demo.designpatterns.decorator.Person;

/**
 * The type Lao wang.
 */
public class LaoWang implements Person {
    @Override
    public Double cost() {
        return 0.0;
    }

    @Override
    public void show() {
        System.out.println("赤裸的老王消费0");
    }
}

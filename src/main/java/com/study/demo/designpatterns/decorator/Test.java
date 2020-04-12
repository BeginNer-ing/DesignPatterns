package com.study.demo.designpatterns.decorator;

import com.study.demo.designpatterns.decorator.imp.Hat;
import com.study.demo.designpatterns.decorator.imp.LaoWang;
import com.study.demo.designpatterns.decorator.imp.Jack;

/**
 * The type Test.
 */
public class Test {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        Person laowang = new LaoWang();
        laowang = new Hat(laowang);
        laowang = new Jack(laowang);
        laowang.show();
        System.out.println("总消费:"+ laowang.cost());
    }
}

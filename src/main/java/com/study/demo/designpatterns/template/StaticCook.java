package com.study.demo.designpatterns.template;

/**
 * @author Yanis
 * @introduction
 * @date 2020/4/13  15:39
 */
public abstract class StaticCook {
    public void fire() {
        System.out.println("生火");
    }

    public void open() {
        System.out.println("打开油烟机");
    }

    /**
     * 让子类实现具体内容
     */
    public abstract void cook();

    public void closeFire() {
        System.out.println("关火");
    }

    public void close() {
        System.out.println("关闭油烟机");
    }

    public final void StaticCook() {
        fire();
        open();
        cook();
        closeFire();
        close();
    }
}

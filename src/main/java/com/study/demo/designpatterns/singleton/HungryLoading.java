package com.study.demo.designpatterns.singleton;

/**
 * The type Hungry loading.
 * 饿汉模式
 * @author yc916
 */
public class HungryLoading {
    private static HungryLoading instance = new HungryLoading();

    private HungryLoading() {
    }

    /**
     * Gets instance.
     *
     * @return the instance
     */
    public static HungryLoading getInstance() {
        return instance;
    }
}

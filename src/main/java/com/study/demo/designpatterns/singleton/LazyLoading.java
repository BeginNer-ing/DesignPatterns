package com.study.demo.designpatterns.singleton;

/**
 * The type Lazy loading.
 * 懒汉模式
 * @author yc916
 */
public class LazyLoading {
    private static LazyLoading instance;

    private LazyLoading() {}

    /**
     * Gets instance.
     *
     * @return the instance
     */
    public static synchronized LazyLoading getInstance() {
        if (instance == null){
            instance = new LazyLoading();
        }
        return instance;
    }
}

package com.study.demo.designpatterns.singleton;

/**
 * @author Yanis
 * @Introduction 双重检查加锁单例模式
 * @date 2020/4/12 22:28
 */
public class DoubleCheck {
    private  static volatile DoubleCheck instance;

    private DoubleCheck() {

    }

    public static DoubleCheck getInstance() {
        //首先检查实例存不存在
        if (instance == null) {
            //同步块，线程安全的创建实例
            synchronized (DoubleCheck.class) {
                //再次检查实例是否真的存在
                if (instance == null) {
                    instance = new DoubleCheck();
                }
            }
        }
        return instance;
    }
}

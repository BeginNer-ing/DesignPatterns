package com.study.demo.designpatterns.factorymode;

import com.study.demo.designpatterns.factorymode.factory.Factory;

/**
 * @author Yanis
 * @introduction
 * @date 2020/4/13  9:57
 */
public class Test {
    public static void main(String[] args) {
        Factory factory0 = new FactoryChoose().getFactory("中国");
        Factory factory1 = new FactoryChoose().getFactory("美国");
    }
}

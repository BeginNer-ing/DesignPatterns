package com.study.demo.designpatterns.factorymode;

import com.study.demo.designpatterns.factorymode.factory.AmericanFactory;
import com.study.demo.designpatterns.factorymode.factory.ChineseFactory;
import com.study.demo.designpatterns.factorymode.factory.Factory;

public class FactoryChoose {
    private Factory factory;
    static final String FACTORY_CHINESE = "中国";
    static final String FACTORY_AMERICAN = "美国";
    public Factory getFactory(String factoryType) {
        if (FACTORY_CHINESE.equals(factoryType)) {
            factory = new ChineseFactory();
        } else if (FACTORY_AMERICAN.equals(factoryType)) {
            factory = new AmericanFactory();
        }
        return factory;
    }
}

package com.study.demo.designpatterns.factorymode.factory;

import com.study.demo.designpatterns.factorymode.product.ChineseProduct;
import com.study.demo.designpatterns.factorymode.product.Product;

public class ChineseFactory implements Factory {
    public ChineseFactory() {
        System.out.println("创建中国工厂");
        ProductionGoods();
    }
    @Override

    public Product ProductionGoods() {
        return new ChineseProduct();
    }
}

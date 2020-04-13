package com.study.demo.designpatterns.factorymode.factory;

import com.study.demo.designpatterns.factorymode.product.Product;
import com.study.demo.designpatterns.factorymode.product.AmericanProduct;

/**
 * @author yc916
 */
public class AmericanFactory implements Factory {
    public AmericanFactory() {
        System.out.println("创建美国工厂");
        ProductionGoods();
    }

    @Override
    public Product ProductionGoods() {
        return new AmericanProduct();
    }
}

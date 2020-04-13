package com.study.demo.designpatterns.factorymode.product;

/**
 * @author Yanis
 * @introduction
 * @date 2020/4/13  9:43
 */
public class ChineseProduct implements Product {
    public ChineseProduct() {
        introduction();
    }
    @Override
    public void introduction() {
        System.out.println("生产一件中国商品");
    }
}

package com.study.demo.designpatterns.template;

/**
 * @author Yanis
 * @introduction
 * @date 2020/4/13  15:47
 */
public class ReallyCook extends StaticCook {
    @Override
    public void cook() {
        System.out.println("做酸辣白菜");
    }

    public static void main(String[] args) {
        StaticCook cook = new ReallyCook();
        cook.StaticCook();
    }
}

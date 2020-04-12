package com.study.demo.designpatterns.strategy.imp;

import com.study.demo.designpatterns.strategy.Operation;

/**
 * The type Sub.
 * @author Yanis_CC
 */
public class Sub implements Operation {

    @Override
    public double doOperation(double num1, double num2) {
        return num1 - num2;
    }
}

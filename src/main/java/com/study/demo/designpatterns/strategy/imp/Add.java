package com.study.demo.designpatterns.strategy.imp;

import com.study.demo.designpatterns.strategy.Operation;

/**
 * The type Add.
 * @author Yanis_CC
 */
public class Add implements Operation {
    @Override
    public double doOperation(double num1, double num2) {
        return num1 + num2;
    }
}

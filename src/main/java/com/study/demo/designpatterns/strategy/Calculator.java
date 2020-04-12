package com.study.demo.designpatterns.strategy;

import com.study.demo.designpatterns.strategy.imp.Add;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Calculator {
    private Operation operation;

    public void setOperation(Operation operation) {
        this.operation = operation;
    }

    public double doOperation(double num1, double num2) {
        return this.operation.doOperation(num1, num2);
    }

    public static void main(String[] args) {
        Logger logger = LoggerFactory.getLogger(Calculator.class);
        Calculator calculator = new Calculator();
        calculator.setOperation(new Add());
        double num3 = calculator.doOperation(3, 2);
        logger.info(String.valueOf(num3));
    }
}

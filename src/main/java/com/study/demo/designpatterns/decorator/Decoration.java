package com.study.demo.designpatterns.decorator;

/**
 * 装饰器超类和被装饰的对象实现同一个接口（也可能使用继承）
 * The type Decoration.
 * @author Yanis_CC
 */
public abstract class Decoration implements Person {
    /**
     * The Person.
     */
    protected Person person;

    /**
     * Instantiates a new Decoration.
     *
     * @param person the person
     */
    public Decoration(Person person) {
        this.person = person;
    }
}

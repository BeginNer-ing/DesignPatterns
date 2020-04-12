package com.study.demo.designpatterns.decorator.imp;

import com.study.demo.designpatterns.decorator.Person;
import com.study.demo.designpatterns.decorator.Decoration;

/**
 * The type Jack.
 * @author Yanis_CC
 */
public class Jack extends Decoration {
    /**
     * Instantiates a new Jack.
     *
     * @param person the person
     */
    public Jack(Person person) {
        super(person);
    }

    @Override
    public Double cost() {
        return person.cost() + 100.0;
    }

    @Override
    public void show() {
        person.show();
        System.out.println("穿上夹克"+ cost());
    }
}

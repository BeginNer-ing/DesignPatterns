package com.study.demo.designpatterns.decorator.imp;

import com.study.demo.designpatterns.decorator.Person;
import com.study.demo.designpatterns.decorator.Decoration;

/**
 * The type Hat.
 * @author Yanis_CC
 */
public class Hat extends Decoration {
    /**
     * Instantiates a new Hat.
     *
     * @param person the person
     */
    public Hat(Person person) {
        super(person);
    }
    @Override
    public Double cost() {
        return person.cost() + 5.0;
    }

    @Override
    public void show() {
        person.show();
        System.out.println("老王买了帽子"+ cost());
    }
}

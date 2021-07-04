package com.designpatterns.examples.patterns.factory;

import com.designpatterns.examples.patterns.factory.model.Pizza;

public class PizzaFactory {

    public Pizza createPizza(String name){
        return new Pizza();
    }
}
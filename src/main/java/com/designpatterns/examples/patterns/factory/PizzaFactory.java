package com.designpatterns.examples.patterns.factory;

import com.designpatterns.examples.patterns.factory.model.Pizza;
import com.designpatterns.examples.patterns.factory.model.PizzaBarbacoa;
import com.designpatterns.examples.patterns.factory.model.PizzaCarbonara;
import com.designpatterns.examples.patterns.factory.model.PizzaDeAtun;

public class PizzaFactory {

    public Pizza createPizza(String name){

        Pizza pizza= new Pizza();
        if("atun".equalsIgnoreCase(name)){
            pizza=  new PizzaDeAtun(name);
        }else if("barbacoa".equalsIgnoreCase(name)){
            pizza= new PizzaBarbacoa(name);
        }else if ("carbonara".equalsIgnoreCase(name)){
            pizza = new PizzaCarbonara(name);
        }

        return pizza;
    }
}
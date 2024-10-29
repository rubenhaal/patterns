package designpatterns.examples.patterns.creationals.factory;

import designpatterns.examples.patterns.creationals.factory.model.PizzaBarbacoa;
import designpatterns.examples.patterns.creationals.factory.model.PizzaCarbonara;
import designpatterns.examples.patterns.creationals.factory.model.Pizza;
import designpatterns.examples.patterns.creationals.factory.model.PizzaDeAtun;

public class PizzaFactory {

    private PizzaFactory() {
    }

    public static Pizza createPizza(String name){

        Pizza pizza;
        if("atun".equalsIgnoreCase(name)){
            pizza=  new PizzaDeAtun(name);
        }else if("barbacoa".equalsIgnoreCase(name)){
            pizza= new PizzaBarbacoa(name);
        }else if ("carbonara".equalsIgnoreCase(name)){
            pizza = new PizzaCarbonara(name);
        }else{
            throw new IllegalArgumentException("We don't have that pizza, sorry");
        }

        return pizza;
    }
}
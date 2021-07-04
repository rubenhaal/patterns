package com.designpatterns.examples.patterns.factory;

import com.designpatterns.examples.patterns.factory.model.Pizza;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PizzaFactoryTest {

    PizzaFactory pizzaFactory = new PizzaFactory();

    @Test
    public void createPizza(){
        //given
        String pizzaName="atun";
        //when
        Pizza pizza = pizzaFactory.createPizza(pizzaName);
        //should

        assertTrue(pizza instanceof  Pizza);
    }
}
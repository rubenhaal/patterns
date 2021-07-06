package com.designpatterns.examples.patterns.factory;

import com.designpatterns.examples.patterns.factory.model.Pizza;
import com.designpatterns.examples.patterns.factory.model.PizzaDeAtun;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class PizzaFactoryTest {

    PizzaFactory pizzaFactory = new PizzaFactory();

    @ParameterizedTest
    @CsvSource({"atun","barbacoa","carbonara"})
    public void createPizza(String pizzaName){
        //given

        //when
        Pizza pizza = pizzaFactory.createPizza(pizzaName);
        //should
        assertEquals(pizzaName,pizza.getNombre());
    }
}
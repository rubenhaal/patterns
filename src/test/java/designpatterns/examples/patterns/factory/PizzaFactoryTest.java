package designpatterns.examples.patterns.factory;

import designpatterns.examples.patterns.creationals.factory.PizzaFactory;
import designpatterns.examples.patterns.creationals.factory.model.Pizza;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PizzaFactoryTest {


    @ParameterizedTest
    @CsvSource({"atun","barbacoa","carbonara"})
    void createPizza(String pizzaName){
        //given

        //when
        Pizza pizza = PizzaFactory.createPizza(pizzaName);
        //should
        assertEquals(pizzaName,pizza.getNombre());
    }
}
package com.designpatterns.examples.patterns.singleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SingletonPatternTest {



    @Test
    public void whenCreatingtwoSingletonObjects_shouldBeTheSame(){
        //Given


        //when
        SingletonPattern single1 = SingletonPattern.getInstance();
        SingletonPattern single2= SingletonPattern.getInstance();

        //then
        assertTrue(single1==single2);

    }
}
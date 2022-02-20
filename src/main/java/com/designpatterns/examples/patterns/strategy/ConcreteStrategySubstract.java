package com.designpatterns.examples.patterns.strategy;

public class ConcreteStrategySubstract implements Strategy{
    @Override
    public int execute(int a, int b) {
        return a-b;
    }
}

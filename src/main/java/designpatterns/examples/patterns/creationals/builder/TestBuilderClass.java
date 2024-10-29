package designpatterns.examples.patterns.creationals.builder;

import designpatterns.examples.patterns.creationals.builder.model.Pizza;

public class TestBuilderClass {

    public static void main(String[] args) {
        Pizza pizza = new Pizza.Builder().build();

    }
}

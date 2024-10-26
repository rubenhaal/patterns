package designpatterns.examples.patterns.creationals.abstractfactory.model;

import designpatterns.examples.patterns.creationals.abstractfactory.model.interfaces.Button;

public class DarkButton implements Button {
    @Override
    public void render() {
        System.out.println("This is a dark button");
    }
}

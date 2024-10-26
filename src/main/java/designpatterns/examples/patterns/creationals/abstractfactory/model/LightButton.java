package designpatterns.examples.patterns.creationals.abstractfactory.model;

import designpatterns.examples.patterns.creationals.abstractfactory.model.interfaces.Button;

public class LightButton implements Button {
    @Override
    public void render() {
        System.out.println("This is a light Button");
    }
}

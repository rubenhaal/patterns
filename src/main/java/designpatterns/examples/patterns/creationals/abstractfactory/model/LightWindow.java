package designpatterns.examples.patterns.creationals.abstractfactory.model;

import designpatterns.examples.patterns.creationals.abstractfactory.model.interfaces.Window;

public class LightWindow implements Window {
    @Override
    public void render() {
        System.out.println("This is a light Window");
    }
}

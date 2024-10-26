package designpatterns.examples.patterns.creationals.abstractfactory.model;

import designpatterns.examples.patterns.creationals.abstractfactory.model.interfaces.Window;

public class DarkWindow implements Window {
    @Override
    public void render() {
        System.out.println("This is a dark Window");
    }
}

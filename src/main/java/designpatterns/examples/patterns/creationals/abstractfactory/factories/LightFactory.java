package designpatterns.examples.patterns.creationals.abstractfactory.factories;

import designpatterns.examples.patterns.creationals.abstractfactory.GuiFactory;
import designpatterns.examples.patterns.creationals.abstractfactory.model.LightButton;
import designpatterns.examples.patterns.creationals.abstractfactory.model.LightWindow;
import designpatterns.examples.patterns.creationals.abstractfactory.model.interfaces.Button;
import designpatterns.examples.patterns.creationals.abstractfactory.model.interfaces.Window;

public class LightFactory implements GuiFactory {
    @Override
    public Button createButton() {
        return new LightButton();
    }

    @Override
    public Window createWindow() {
        return new LightWindow();
    }
}

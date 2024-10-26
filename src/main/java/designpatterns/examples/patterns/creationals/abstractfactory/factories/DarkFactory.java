package designpatterns.examples.patterns.creationals.abstractfactory.factories;

import designpatterns.examples.patterns.creationals.abstractfactory.GuiFactory;
import designpatterns.examples.patterns.creationals.abstractfactory.model.DarkButton;
import designpatterns.examples.patterns.creationals.abstractfactory.model.DarkWindow;
import designpatterns.examples.patterns.creationals.abstractfactory.model.interfaces.Button;
import designpatterns.examples.patterns.creationals.abstractfactory.model.interfaces.Window;

public class DarkFactory implements GuiFactory {
    @Override
    public Button createButton() {
        return new DarkButton();
    }

    @Override
    public Window createWindow() {
        return new DarkWindow();
    }
}

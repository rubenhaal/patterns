package designpatterns.examples.patterns.creationals.abstractfactory;


import designpatterns.examples.patterns.creationals.abstractfactory.model.interfaces.Button;
import designpatterns.examples.patterns.creationals.abstractfactory.model.interfaces.Window;

/**
 * Main interface all the abstract class will implement the behavior
 * of  this interface
 * Hauptschnittstelle. Alle abstrakten Schnittstellenklassen implementieren
 * das Verhalten dieser Schnittstelle
 */
public interface GuiFactory {
    Button createButton();
    Window createWindow();
}

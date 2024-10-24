package designpatterns.examples.patterns.creationals.abstractfactory;

import designpatterns.examples.patterns.creationals.abstractfactory.factoryInterface.AbstractFactory;
import designpatterns.examples.patterns.creationals.abstractfactory.interfaces.IChair;
import designpatterns.examples.patterns.creationals.abstractfactory.interfaces.ICoffeeTable;
import designpatterns.examples.patterns.creationals.abstractfactory.interfaces.ISofa;
import designpatterns.examples.patterns.creationals.abstractfactory.model.ModernChair;
import designpatterns.examples.patterns.creationals.abstractfactory.model.ModernCoffeeTable;
import designpatterns.examples.patterns.creationals.abstractfactory.model.ModernSofa;

public class ModernFornitureFactory extends AbstractFactory {
    @Override
    public IChair getChair() {
        return new ModernChair();
    }

    @Override
    public ICoffeeTable getCoffeeTable() {
        return new ModernCoffeeTable();
    }

    @Override
    public ISofa getSofa() {
        return new ModernSofa();
    }
}

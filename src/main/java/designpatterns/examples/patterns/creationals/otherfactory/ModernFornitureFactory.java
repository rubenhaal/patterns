package designpatterns.examples.patterns.creationals.otherfactory;

import designpatterns.examples.patterns.creationals.otherfactory.factoryInterface.OtherFactory;
import designpatterns.examples.patterns.creationals.otherfactory.interfaces.IChair;
import designpatterns.examples.patterns.creationals.otherfactory.interfaces.ICoffeeTable;
import designpatterns.examples.patterns.creationals.otherfactory.interfaces.ISofa;
import designpatterns.examples.patterns.creationals.otherfactory.model.ModernChair;
import designpatterns.examples.patterns.creationals.otherfactory.model.ModernCoffeeTable;
import designpatterns.examples.patterns.creationals.otherfactory.model.ModernSofa;

public class ModernFornitureFactory extends OtherFactory {
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

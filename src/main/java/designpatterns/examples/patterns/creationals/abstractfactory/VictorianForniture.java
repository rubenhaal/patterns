package designpatterns.examples.patterns.creationals.abstractfactory;

import designpatterns.examples.patterns.creationals.abstractfactory.factoryInterface.AbstractFactory;
import designpatterns.examples.patterns.creationals.abstractfactory.interfaces.IChair;
import designpatterns.examples.patterns.creationals.abstractfactory.interfaces.ICoffeeTable;
import designpatterns.examples.patterns.creationals.abstractfactory.interfaces.ISofa;
import designpatterns.examples.patterns.creationals.abstractfactory.model.VictorianChair;
import designpatterns.examples.patterns.creationals.abstractfactory.model.VictorianCoffeeTable;
import designpatterns.examples.patterns.creationals.abstractfactory.model.VictorianSofa;

public class VictorianForniture extends AbstractFactory {
    @Override
    public IChair getChair() {
        return new VictorianChair();
    }

    @Override
    public ICoffeeTable getCoffeeTable() {
        return new VictorianCoffeeTable();
    }

    @Override
    public ISofa getSofa() {
        return new VictorianSofa();
    }
}

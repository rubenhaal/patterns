package designpatterns.examples.patterns.creationals.otherfactory;

import designpatterns.examples.patterns.creationals.otherfactory.factoryInterface.OtherFactory;
import designpatterns.examples.patterns.creationals.otherfactory.interfaces.IChair;
import designpatterns.examples.patterns.creationals.otherfactory.interfaces.ICoffeeTable;
import designpatterns.examples.patterns.creationals.otherfactory.interfaces.ISofa;
import designpatterns.examples.patterns.creationals.otherfactory.model.VictorianChair;
import designpatterns.examples.patterns.creationals.otherfactory.model.VictorianCoffeeTable;
import designpatterns.examples.patterns.creationals.otherfactory.model.VictorianSofa;

public class VictorianForniture extends OtherFactory {
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

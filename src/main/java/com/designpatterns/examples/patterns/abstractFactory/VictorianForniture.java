package com.designpatterns.examples.patterns.abstractFactory;

import com.designpatterns.examples.patterns.abstractFactory.factoryInterface.AbstractFactory;
import com.designpatterns.examples.patterns.abstractFactory.interfaces.IChair;
import com.designpatterns.examples.patterns.abstractFactory.interfaces.ICoffeeTable;
import com.designpatterns.examples.patterns.abstractFactory.interfaces.ISofa;
import com.designpatterns.examples.patterns.abstractFactory.model.VictorianChair;
import com.designpatterns.examples.patterns.abstractFactory.model.VictorianCoffeeTable;
import com.designpatterns.examples.patterns.abstractFactory.model.VictorianSofa;

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

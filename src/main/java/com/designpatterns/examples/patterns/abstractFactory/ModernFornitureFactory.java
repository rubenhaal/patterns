package com.designpatterns.examples.patterns.abstractFactory;

import com.designpatterns.examples.patterns.abstractFactory.factoryInterface.AbstractFactory;
import com.designpatterns.examples.patterns.abstractFactory.interfaces.IChair;
import com.designpatterns.examples.patterns.abstractFactory.interfaces.ICoffeeTable;
import com.designpatterns.examples.patterns.abstractFactory.interfaces.ISofa;
import com.designpatterns.examples.patterns.abstractFactory.model.ModernChair;
import com.designpatterns.examples.patterns.abstractFactory.model.ModernCoffeeTable;
import com.designpatterns.examples.patterns.abstractFactory.model.ModernSofa;

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

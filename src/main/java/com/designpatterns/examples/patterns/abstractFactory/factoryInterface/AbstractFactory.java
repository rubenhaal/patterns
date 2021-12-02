package com.designpatterns.examples.patterns.abstractFactory.factoryInterface;

import com.designpatterns.examples.patterns.abstractFactory.ModernFornitureFactory;
import com.designpatterns.examples.patterns.abstractFactory.VictorianForniture;
import com.designpatterns.examples.patterns.abstractFactory.interfaces.IChair;
import com.designpatterns.examples.patterns.abstractFactory.interfaces.ICoffeeTable;
import com.designpatterns.examples.patterns.abstractFactory.interfaces.ISofa;

public abstract class AbstractFactory {

    public static String VICTORIAN = "victorian";
    public static String MODERN = "modern";

    public abstract IChair getChair();
    public abstract ICoffeeTable getCoffeeTable();
    public abstract ISofa getSofa();

    public static AbstractFactory getFactory(String type){
        if(VICTORIAN.equalsIgnoreCase(type)){
            return new VictorianForniture();
        }else if(MODERN.equalsIgnoreCase(type)){
            return new ModernFornitureFactory();
        }
        return null;
    }
}

package designpatterns.examples.patterns.creationals.abstractfactory.factoryInterface;

import designpatterns.examples.patterns.creationals.abstractfactory.ModernFornitureFactory;
import designpatterns.examples.patterns.creationals.abstractfactory.VictorianForniture;
import designpatterns.examples.patterns.creationals.abstractfactory.interfaces.IChair;
import designpatterns.examples.patterns.creationals.abstractfactory.interfaces.ICoffeeTable;
import designpatterns.examples.patterns.creationals.abstractfactory.interfaces.ISofa;

public abstract class AbstractFactory {

    private static final String VICTORIAN_FURNITURE = "victorian";
    public static final String MODERN_FURNITURE = "modern";

    public abstract IChair getChair();
    public abstract ICoffeeTable getCoffeeTable();
    public abstract ISofa getSofa();

    public static AbstractFactory getFactory(String type){
        if(VICTORIAN_FURNITURE.equalsIgnoreCase(type)){
            return new VictorianForniture();
        }else if(MODERN_FURNITURE.equalsIgnoreCase(type)){
            return new ModernFornitureFactory();
        }
        return null;
    }
}

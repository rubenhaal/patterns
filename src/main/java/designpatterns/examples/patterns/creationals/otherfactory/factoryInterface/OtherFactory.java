package designpatterns.examples.patterns.creationals.otherfactory.factoryInterface;

import designpatterns.examples.patterns.creationals.otherfactory.ModernFornitureFactory;
import designpatterns.examples.patterns.creationals.otherfactory.VictorianForniture;
import designpatterns.examples.patterns.creationals.otherfactory.interfaces.IChair;
import designpatterns.examples.patterns.creationals.otherfactory.interfaces.ICoffeeTable;
import designpatterns.examples.patterns.creationals.otherfactory.interfaces.ISofa;

public abstract class OtherFactory {

    private static final String VICTORIAN_FURNITURE = "victorian";
    public static final String MODERN_FURNITURE = "modern";

    public abstract IChair getChair();
    public abstract ICoffeeTable getCoffeeTable();
    public abstract ISofa getSofa();

    public static OtherFactory getFactory(String type){
        if(VICTORIAN_FURNITURE.equalsIgnoreCase(type)){
            return new VictorianForniture();
        }else if(MODERN_FURNITURE.equalsIgnoreCase(type)){
            return new ModernFornitureFactory();
        }
        return null;
    }
}

package designpatterns.examples.patterns.creationals.singleton;

/**
 * For certain class we only need to have one instance as a matter of fact sometimes having two or mor of this
 * class could bring a bad behavior.
 */
public class SingletonPattern {

    private static SingletonPattern singletonPattern;
    //private static SingletonPattern uniqueInstance = new SingletonPattern(); Eager aproach we don't need
    //synchronized with this option

    private volatile static SingletonPattern singletonPattern2;
//hace  que el valor de la variable sea guardado en memoria y no en la caché
    private SingletonPattern(){}

    public static synchronized SingletonPattern  getInstance(){

        if(singletonPattern== null){
            singletonPattern = new SingletonPattern();
        }
        return singletonPattern;
    }
}
package designpatterns.examples.patterns.behavioral.chainofresponsability;

import java.util.List;

public abstract class Container extends  Component{
    List<Component> children;

    public void add (Component child){
        this.children.add(child);
    }

}

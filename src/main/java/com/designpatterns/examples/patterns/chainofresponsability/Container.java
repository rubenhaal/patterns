package com.designpatterns.examples.patterns.chainofresponsability;

import java.util.List;

public abstract class Container extends  Component{
    List<Component> children;

    public void add (Component child){
        this.children.add(child);
    }

}

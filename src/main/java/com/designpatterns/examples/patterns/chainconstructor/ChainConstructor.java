package com.designpatterns.examples.patterns.chainconstructor;


import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

/**
 * The theory: if you have multiple constructor that contain duplicate code you can chan the constructor toegether to
 * to obtain  the least duplicate code.
 */
public class ChainConstructor {

    private String prop1;
    private String prop2;
    private String prop3;
    private String prop4;
    private String prop5;

    private List listas;

    public ChainConstructor(String prop1, String prop2, String prop3, String prop4, String prop5){
        this(prop1,prop2,prop3, prop4, prop5, new ArrayList());
    }
    public ChainConstructor(String prop1, String prop2, String prop3, String prop4){
        this(prop1,prop2,prop3, prop4,new String(), new Vector());
    }

    public ChainConstructor(String prop1, String prop2, String prop3, String prop4, String prop5, List listas) {
        this.prop1 = prop1;
        this.prop2 = prop2;
        this.prop3 = prop3;
        this.prop4 = prop4;
        this.prop5 = prop5;
        this.listas = listas;
    }


}

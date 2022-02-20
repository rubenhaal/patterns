package com.designpatterns.examples.patterns.chainofresponsability;

public class Panel extends Container{

    @Override
    public String showHelp(){
        super.showHelp();
        return "panel";
    }
}

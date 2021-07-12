package com.designpatterns.examples.patterns.command.button;

public class SaveButton implements Button{
    @Override
    public String execute() {
        return "Save";
    }
}

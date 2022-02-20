package com.designpatterns.examples.patterns.command.buttonCommand;

public class CutCommand implements Command{
    @Override
    public String execute() {
        return "cut";
    }
}

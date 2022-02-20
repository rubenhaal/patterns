package com.designpatterns.examples.patterns.command.buttonCommand;

public class CopyCommand implements Command{

    @Override
    public String execute() {
        return "Copy";
    }
}

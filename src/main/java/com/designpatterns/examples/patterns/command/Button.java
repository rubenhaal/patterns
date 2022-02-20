package com.designpatterns.examples.patterns.command;

import com.designpatterns.examples.patterns.command.buttonCommand.Command;


public class Button {
    private Command command;

    public Command getCommand() {
        return command;
    }

    public void setCommand(Command command) {
        this.command = command;
    }
}

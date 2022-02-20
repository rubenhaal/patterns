package com.designpatterns.examples.patterns.command;

import com.designpatterns.examples.patterns.command.buttonCommand.Command;
import com.designpatterns.examples.patterns.command.buttonCommand.CopyCommand;
import com.designpatterns.examples.patterns.command.buttonCommand.CutCommand;

public class CommandPattern {

    public CommandPattern(){
        Button copyButton= new Button();
        copyButton.setCommand(new CopyCommand());

        Button cutButton = new Button();
        cutButton.setCommand(new CutCommand());

    }
}

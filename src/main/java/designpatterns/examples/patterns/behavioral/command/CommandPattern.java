package designpatterns.examples.patterns.behavioral.command;

import designpatterns.examples.patterns.behavioral.command.buttoncommand.CopyCommand;
import designpatterns.examples.patterns.behavioral.command.buttoncommand.CutCommand;

public class CommandPattern {

    public CommandPattern(){
        Button copyButton= new Button();
        copyButton.setCommand(new CopyCommand());

        Button cutButton = new Button();
        cutButton.setCommand(new CutCommand());

    }
}

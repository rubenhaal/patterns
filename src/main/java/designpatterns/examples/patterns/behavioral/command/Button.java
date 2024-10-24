package designpatterns.examples.patterns.behavioral.command;

import designpatterns.examples.patterns.behavioral.command.buttoncommand.Command;


public class Button {
    private Command command;

    public Command getCommand() {
        return command;
    }

    public void setCommand(Command command) {
        this.command = command;
    }
}

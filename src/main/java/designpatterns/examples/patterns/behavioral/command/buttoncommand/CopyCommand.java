package designpatterns.examples.patterns.behavioral.command.buttoncommand;

public class CopyCommand implements Command{

    @Override
    public String execute() {
        return "Copy";
    }
}

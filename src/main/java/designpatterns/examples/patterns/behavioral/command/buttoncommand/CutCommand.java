package designpatterns.examples.patterns.behavioral.command.buttoncommand;

public class CutCommand implements Command{
    @Override
    public String execute() {
        return "cut";
    }
}

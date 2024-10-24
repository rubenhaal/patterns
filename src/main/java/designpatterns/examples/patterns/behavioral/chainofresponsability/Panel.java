package designpatterns.examples.patterns.behavioral.chainofresponsability;

public class Panel extends Container{

    @Override
    public String showHelp(){
        super.showHelp();
        return "panel";
    }
}

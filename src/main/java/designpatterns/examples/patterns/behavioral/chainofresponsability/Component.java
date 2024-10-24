package designpatterns.examples.patterns.behavioral.chainofresponsability;

public  abstract class Component implements ComponentWithContextualHelp{

    private String tooltip;

    protected Container container;

    @Override
    public String showHelp() {
        return "help";
    }

    public String getTooltip() {
        return tooltip;
    }

    public void setTooltip(String tooltip) {
        this.tooltip = tooltip;
    }

    public Container getContainer() {
        return container;
    }

    public void setContainer(Container container) {
        this.container = container;
    }
}

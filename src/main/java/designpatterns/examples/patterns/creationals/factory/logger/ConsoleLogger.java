package designpatterns.examples.patterns.creationals.factory.logger;

public class ConsoleLogger implements ILogger {
    @Override
    public void log(String msg) {
        System.out.println(msg);
    }
}

package com.designpatterns.examples.patterns.factory.Logger;

public class ConsoleLogger implements ILogger {
    @Override
    public void log(String msg) {
        System.out.println(msg);
    }
}

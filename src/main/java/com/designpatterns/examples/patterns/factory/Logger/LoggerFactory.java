package com.designpatterns.examples.patterns.factory.Logger;

public class LoggerFactory {

    private boolean isFileLoggingEnabled(){
        //whatever logic
        return true;
    }
    public ILogger getLogger(){
        if(isFileLoggingEnabled()){
            return FileLogger.getFileLogger();
        }else{
            return new ConsoleLogger();
        }
    }
}

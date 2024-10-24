package designpatterns.examples.patterns.creationals.factory.logger;

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

package com.designpatterns.examples.patterns.factory.Logger;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileLogger implements ILogger{

    private static FileLogger logger;

    private FileLogger(){

    }

    public static FileLogger getFileLogger(){
        if (logger==null){
            logger = new FileLogger();
        }
        return logger;
    }

    @Override
    public void log(String msg) {
        Path path = Paths.get("test.txt");
        try {
            Files.writeString(path, msg);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

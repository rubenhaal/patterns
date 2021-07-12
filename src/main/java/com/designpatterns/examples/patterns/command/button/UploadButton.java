package com.designpatterns.examples.patterns.command.button;

public class UploadButton implements Button{
    @Override
    public String execute() {
        return "Upload";
    }
}

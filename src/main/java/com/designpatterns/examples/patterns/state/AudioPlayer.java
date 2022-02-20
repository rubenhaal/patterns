package com.designpatterns.examples.patterns.state;

public class AudioPlayer {

    private State state;

    public String clickLock(){
        return this.state.clickLock();
    }
}

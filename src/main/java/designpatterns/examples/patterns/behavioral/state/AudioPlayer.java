package designpatterns.examples.patterns.behavioral.state;

public class AudioPlayer {

    private State state;

    public String clickLock(){
        return this.state.clickLock();
    }
}

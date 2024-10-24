package designpatterns.examples.patterns.behavioral.state;

public abstract class State {

    protected AudioPlayer audioPlayer;

    public abstract String clickLock();
    public abstract String clickPlay();
    public abstract String clickNext();
    public abstract String clickPrevius();
}

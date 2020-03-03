package headfirstdesignpatterns.facade;

import headfirstdesignpatterns.facade.appliances.*;

public class HomeTheaterFacade {

    private Amp amp;
    private CdPlayer cdPlayer;
    private DvdPlayer dvdPlayer;
    private Tv tv;
    private PopcornPopper popcornPopper;

    public HomeTheaterFacade(Amp amp, CdPlayer cdPlayer, DvdPlayer dvdPlayer, Tv tv, PopcornPopper popcornPopper) {
        this.amp = amp;
        this.cdPlayer = cdPlayer;
        this.dvdPlayer = dvdPlayer;
        this.tv = tv;
        this.popcornPopper = popcornPopper;
    }

    public void watchMovie() {
        amp.turnOn();
        amp.setDvd();
        amp.setVolume(50);
        tv.turnOn();
        tv.setDvd();
        popcornPopper.turnOn();
        popcornPopper.pop();
    }

    public void stopWatchingMovie() {
        amp.turnOff();
        tv.turnOff();
        popcornPopper.turnOff();
    }

    public void listenToMusic() {
        amp.turnOn();
        amp.setCd();
        amp.setVolume(30);
        cdPlayer.turnOn();
        cdPlayer.play();
    }

    public void stopListeningToMusic() {
        cdPlayer.turnOff();
        amp.turnOff();
    }
}

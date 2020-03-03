package headfirstdesignpatterns.facade;

import headfirstdesignpatterns.facade.appliances.*;
import org.junit.Test;

public class HomeTheaterFacadeTest {

    private HomeTheaterFacade facade = new HomeTheaterFacade(new Amp(), new CdPlayer(), new DvdPlayer(), new Tv(),
            new PopcornPopper());

    @Test
    public void listenToMusicTest() {
        facade.listenToMusic();
        facade.stopListeningToMusic();
    }

    @Test
    public void watchMovieTest() {
        facade.watchMovie();
        facade.stopWatchingMovie();
    }
}

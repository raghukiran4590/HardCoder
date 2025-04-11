package designpatterns.structural.Facade;

public class HomeTheatreFacade {

    private DVDPlayer dvdPlayer;
    private Amplifier amplifier;
    private Projector projector;

    public HomeTheatreFacade(DVDPlayer dvdPlayer, Amplifier amplifier, Projector projector) {
        this.dvdPlayer = dvdPlayer;
        this.amplifier = amplifier;
        this.projector = projector;
    }

    public void watchMovie(String movie) {
        dvdPlayer.turnOn();
        amplifier.turnOn();
        amplifier.setSurroundOn();
        projector.turnOn();
        projector.setInput("DVD");
        dvdPlayer.play(movie);
    }
}
